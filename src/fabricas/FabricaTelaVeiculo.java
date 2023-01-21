package fabricas;

import entidades.TipoVeiculo;
import entidades.VeiculoGrande;
import entidades.VeiculoPequeno;
import entidades.VeiculoSUV;
import interfaces.Veiculo;

public class FabricaTelaVeiculo {

    public static Veiculo getInstance(TipoVeiculo veiculo){
        switch (veiculo){
            case PEQUENO:
                return new VeiculoPequeno();
            case GRANDE:
                return new VeiculoGrande();
            case SUV:
                return new VeiculoSUV();
        }
        return null;
    }
}
