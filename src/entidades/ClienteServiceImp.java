package entidades;

import interfaces.Cliente;
import interfaces.ClienteRepository;
import interfaces.ClienteService;

public class ClienteServiceImp implements ClienteService {

    private Cliente cliente;

    ClienteRepository repository;

    public ClienteServiceImp(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarCliente(ClienteImp cliente) {
        repository.salvar(cliente);
    }

}
