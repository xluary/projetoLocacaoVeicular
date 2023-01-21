package telas;

import entidades.ClienteImp;
import entidades.ClientePFImp;
import entidades.TipoCliente;
import fabricas.FabricaTelaCliente;
import repository.ClienteRepositoryImp;
import service.ClienteServiceImp;
import interfaces.*;

import java.util.Optional;
import java.util.Scanner;

public class TelaCadastroCliente {

    public static void executar(Scanner scanner, ClienteService serviceCliente) {
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();
        System.out.println("Escolha o tipo de cliente: ");
        for(TipoCliente tipoCliente: TipoCliente.values()){
            System.out.printf("Opção (%d) - %s \n", tipoCliente.getOpcao(), tipoCliente.getLabel());
        }
        TelaGerarCliente telaCliente = FabricaTelaCliente.getInstance(TipoCliente.fromOpcao(scanner.nextInt()));
        Cliente cliente = telaCliente.gerarCliente(nome, scanner);
        serviceCliente.cadastrarCliente(cliente);
        System.out.println("Cliente cadastrado!");
    }
}
