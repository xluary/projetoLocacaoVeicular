package telas;

import interfaces.AluguelRepository;
import interfaces.Cliente;
import java.util.Scanner;

public class TelaAlugueisCliente {
    public static void executar(Scanner scanner, AluguelRepository repository) throws Exception {

        Cliente cliente = TelaRecuperarCliente.recuperarCliente(scanner);
        repository.buscarPorCliente(cliente);


    }
}
