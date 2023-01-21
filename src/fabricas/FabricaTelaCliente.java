package fabricas;


import entidades.TipoCliente;
import interfaces.Tela;
import interfaces.TelaGerarCliente;
import telas.TelaGerarClientePF;
import telas.TelaGerarClientePJ;

import java.util.Optional;

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
