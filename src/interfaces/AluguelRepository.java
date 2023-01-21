package interfaces;

import entidades.Aluguel;

import java.util.List;
import java.util.Optional;

public interface AluguelRepository {

    void salvarAluguel(Aluguel aluguel);

    List<Aluguel>getListaAlugueis();

    void buscarPorCliente(Cliente cliente);
}
