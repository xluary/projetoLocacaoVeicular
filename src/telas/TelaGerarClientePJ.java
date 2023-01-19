package telas;

import entidades.ClienteImp;
import entidades.ClientePJImp;
import interfaces.Cliente;
import interfaces.TelaGerarCliente;
import java.util.Scanner;

public class TelaGerarClientePJ implements TelaGerarCliente {

    public ClienteImp gerarCliente(String nome, Scanner scanner) {
        System.out.println("Digite o CNPJ do cliente: ");
        String cnpj = scanner.next();
        ClienteImp cliente = new ClientePJImp(nome, cnpj);
        return cliente;
    }
}
