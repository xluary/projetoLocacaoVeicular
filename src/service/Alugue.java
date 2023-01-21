package service;

import entidades.Aluguel;
import interfaces.AlugueService;
import interfaces.AluguelRepository;
import interfaces.Cliente;
import interfaces.Veiculo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Alugue implements AlugueService {

    private AluguelRepository aluguelRepository;

    public Alugue(AluguelRepository aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }
    @Override
   public BigDecimal calcularAluguel(Cliente cliente, Veiculo veiculo, int quantDiasAluguel){

        BigDecimal desconto = BigDecimal.ZERO;
        BigDecimal tempDias = new BigDecimal(quantDiasAluguel);
        BigDecimal valorIntegral = veiculo.getDiariaAluguel().multiply(tempDias);

        if (quantDiasAluguel > cliente.getQuantDiariaDesconto()){
            BigDecimal tempDesconto = new BigDecimal(cliente.getDesconto());
            desconto = valorIntegral.multiply(tempDesconto);
        }

        return valorIntegral.subtract(desconto);
   }

   public void alugar(Veiculo veiculo, Cliente cliente, int quantDiasAluguel){
       long now = System.currentTimeMillis();
       Aluguel aluguel = new Aluguel(veiculo, cliente, quantDiasAluguel, new Timestamp(now));
       aluguelRepository.salvarAluguel(aluguel);
   }
}
