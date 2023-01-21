package telas;

import interfaces.Cliente;
import interfaces.ClienteRepository;
import repository.ClienteRepositoryImp;

import java.util.Scanner;

public class TelaRecuperarCliente {
    public static Cliente recuperarCliente(Scanner scanner) throws Exception {
        scanner.nextLine();
        System.out.println("Informe o nome do cliente: ");
        ClienteRepository bancoCliente = ClienteRepositoryImp.getInstance();
        String nome = scanner.nextLine();
        Cliente cliente = bancoCliente.buscarPorNome(nome).orElseThrow(() -> new Exception("Cliente não encontrado."));
        return cliente;
    }
}
