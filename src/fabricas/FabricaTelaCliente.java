package fabricas;


import entidades.TipoCliente;
import interfaces.TelaGerarCliente;
import telas.TelaGerarClientePF;
import telas.TelaGerarClientePJ;


public class FabricaTelaCliente {

    public static TelaGerarCliente getInstance(TipoCliente opcao){
        switch (opcao){
            case PF:
                return new TelaGerarClientePF();
            case PJ:
                return new TelaGerarClientePJ();
        }
        return null;
    }
}
