package entidades;

import interfaces.Veiculo;

import java.math.BigDecimal;

public class VeiculoPequeno implements Veiculo {
    BigDecimal diariaAluguel;

    public VeiculoPequeno() {
        this.diariaAluguel = BigDecimal.valueOf(100);
    }

    @Override
    public BigDecimal getDiariaAluguel() {
        return this.diariaAluguel;
    }
}
