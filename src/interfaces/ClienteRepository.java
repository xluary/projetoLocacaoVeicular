package interfaces;


import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

    void salvar(Cliente cliente);

    List<Cliente> getClientes();

    public Optional<Cliente> buscarPorNome(String nome);
}
