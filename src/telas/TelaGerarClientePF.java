package telas;

import entidades.ClienteImp;
import entidades.ClientePFImp;
import interfaces.Cliente;
import interfaces.TelaGerarCliente;
import java.util.Scanner;

public class TelaGerarClientePF implements TelaGerarCliente {
    @Override
    public ClienteImp gerarCliente(String nome, Scanner scanner) {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.next();
        ClienteImp cliente = new ClientePFImp(nome, cpf);
        return cliente;
    }
}
