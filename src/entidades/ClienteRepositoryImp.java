package entidades;

import interfaces.Cliente;
import interfaces.ClienteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteRepositoryImp implements ClienteRepository {

    private static ArrayList<ClienteImp> listaClientes;

    private static ClienteRepositoryImp instance;

    public static ClienteRepositoryImp getInstance(){
        if(Objects.isNull(instance)){
            instance = new ClienteRepositoryImp();
        }
        return instance;
    }

    @Override
    public void salvar(ClienteImp cliente) {
        if(Objects.isNull(listaClientes)){
            listaClientes = new ArrayList<>();
        }
        listaClientes.add(cliente);
    }

    @Override
    public List<ClienteImp> getClientes() {
        return listaClientes;
    }
}
