package entidades;

import interfaces.AlugueService;
import interfaces.Cliente;
import interfaces.Veiculo;

import java.math.BigDecimal;

public class Alugue implements AlugueService {

    Cliente cliente;

    Veiculo veiculo;

    int quantDiasAluguel;

    public Alugue(Cliente cliente, Veiculo veiculo, int quantDiasAluguel) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.quantDiasAluguel = quantDiasAluguel;
    }
    @Override
   public BigDecimal calcularAluguel(){

        BigDecimal desconto = BigDecimal.ZERO;
        BigDecimal tempDias = new BigDecimal(quantDiasAluguel);
        BigDecimal valorIntegral = veiculo.getDiariaAluguel().multiply(tempDias);

        if (this.quantDiasAluguel > cliente.getQuantDiariaDesconto()){
            BigDecimal tempDesconto = new BigDecimal(cliente.getDesconto());
            desconto = valorIntegral.multiply(tempDesconto);
        }

        return valorIntegral.subtract(desconto);
   }
}
