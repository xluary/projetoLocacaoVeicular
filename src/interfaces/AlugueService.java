package interfaces;

import java.math.BigDecimal;

public interface AlugueService {

    BigDecimal calcularAluguel(Cliente cliente, Veiculo veiculo, int quantDiasAluguel);

    void alugar(Veiculo veiculo, Cliente cliente, int quantDiasAluguel);
}
