package entidades;

import interfaces.Veiculo;

import java.math.BigDecimal;

public class VeiculoGrande implements Veiculo {

    BigDecimal diariaAluguel;

    public VeiculoGrande() {
        this.diariaAluguel = BigDecimal.valueOf(150);
    }

    @Override
    public BigDecimal getDiariaAluguel() {
        return this.diariaAluguel;
    }
}
