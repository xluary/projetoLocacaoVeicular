package telas;

import entidades.ClienteImp;
import entidades.ClientePFImp;
import entidades.ClienteRepositoryImp;
import entidades.ClienteServiceImp;
import interfaces.*;

import java.util.Scanner;

public class TelaCadastroCliente implements Tela {

    @Override
    public void executar(Scanner scanner) {
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite: \n \t (1) Pessoa Física \n \t (2) Pessoa Jurídica");
        int opcao = scanner.nextInt();
        ClienteImp cliente = new ClientePFImp("Auto", "000000");
        if (opcao == 1){
            TelaGerarCliente tela = new TelaGerarClientePF();
            cliente = tela.gerarCliente(nome, scanner);
        } else if (opcao == 2) {
            TelaGerarCliente tela = new TelaGerarClientePJ();
            cliente = tela.gerarCliente(nome, scanner);
        } else {
            System.out.println("Digite (1) ou (2)");
        }
        ClienteService service = new ClienteServiceImp(ClienteRepositoryImp.getInstance());
        service.cadastrarCliente(cliente);
    }
}
