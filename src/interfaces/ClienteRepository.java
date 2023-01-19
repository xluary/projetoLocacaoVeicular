package interfaces;

import entidades.ClienteImp;

import java.util.List;

public interface ClienteRepository {

    void salvar(ClienteImp cliente);

    List<ClienteImp> getClientes();
}
