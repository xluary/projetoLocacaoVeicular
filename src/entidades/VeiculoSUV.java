package entidades;

import interfaces.Veiculo;

import java.math.BigDecimal;

public class VeiculoSUV implements Veiculo {

    BigDecimal diariaAluguel;

    public VeiculoSUV() {
        this.diariaAluguel = BigDecimal.valueOf(200);
    }

    @Override
    public BigDecimal getDiariaAluguel() {
        return this.diariaAluguel;
    }

}
