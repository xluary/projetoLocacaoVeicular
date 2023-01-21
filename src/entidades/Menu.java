package entidades;

import interfaces.AlugueService;
import interfaces.AluguelRepository;
import interfaces.ClienteService;
import telas.TelaAlugueisCliente;
import telas.TelaAluguel;
import telas.TelaCadastroCliente;

import java.util.Scanner;


public class Menu {
    public static void executar (Scanner scanner, AluguelRepository repository, AlugueService serviceAlugue, ClienteService serviceCliente) throws Exception {
        int opcaoMenu;
        do{
            System.out.println("Escolha uma opção:");
            for(OpcoesMenu opcoesMenu: OpcoesMenu.values()){
                System.out.printf("Opção (%d) - %s \n", opcoesMenu.getOpcao(), opcoesMenu.getLabel());
            }
            opcaoMenu = scanner.nextInt();
            switch (OpcoesMenu.fromOpcao(opcaoMenu)){
                case SAIR:
                    System.out.println("Sistema encerrado!");
                    break;
                case CADASTRO:
                    TelaCadastroCliente.executar(scanner, serviceCliente);
                    break;
                case ALUGUEL:
                    TelaAluguel.executar(scanner, repository, serviceAlugue);
                    break;
                case BUSCARALUGUELCLIENTE:
                    TelaAlugueisCliente.executar(scanner,repository);
                    break;
            }


        } while (opcaoMenu !=0);


    }
}
