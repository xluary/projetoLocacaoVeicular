package telas;

import entidades.Aluguel;
import interfaces.AluguelRepository;
import interfaces.Cliente;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TelaAlugueisCliente {
    public static void executar(Scanner scanner, AluguelRepository repository) throws Exception {

        Cliente cliente = TelaRecuperarCliente.recuperarCliente(scanner);
        repository.buscarPorCliente(cliente);


    }
}
