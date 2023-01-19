package interfaces;

import entidades.ClienteImp;

import java.util.Scanner;

public interface TelaGerarCliente {

    ClienteImp gerarCliente(String nome, Scanner scanner);
}
