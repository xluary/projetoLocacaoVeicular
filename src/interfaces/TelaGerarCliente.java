package interfaces;

import entidades.ClienteImp;

import java.util.Scanner;

public interface TelaGerarCliente {

    Cliente gerarCliente(String nome, Scanner scanner);
}
