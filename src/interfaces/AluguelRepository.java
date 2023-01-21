package interfaces;

import entidades.Aluguel;

import java.util.List;


public interface AluguelRepository {

    void salvarAluguel(Aluguel aluguel);

    List<Aluguel>getListaAlugueis();

    void buscarPorCliente(Cliente cliente);
}
