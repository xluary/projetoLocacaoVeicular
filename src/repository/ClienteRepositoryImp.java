package repository;

import interfaces.Cliente;
import interfaces.ClienteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ClienteRepositoryImp implements ClienteRepository {

    private static ArrayList<Cliente> listaClientes;

    private static ClienteRepositoryImp instance;

    public static ClienteRepositoryImp getInstance(){
        if(Objects.isNull(instance)){
            instance = new ClienteRepositoryImp();
        }
        return instance;
    }

    @Override
    public void salvar(Cliente cliente) {
        if(Objects.isNull(listaClientes)){
            listaClientes = new ArrayList<>();
        }
        listaClientes.add(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorNome(String nome) {
        if(Objects.isNull(listaClientes)){
            throw new RuntimeException("Nenhum cliente cadastrado!");
        }
        for (Cliente cliente : listaClientes) {
            if(cliente.getNome().equalsIgnoreCase(nome)){
                return Optional.of(cliente);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Cliente> getClientes() {
        return listaClientes;
    }
}
