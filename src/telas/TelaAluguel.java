package telas;

import entidades.TipoVeiculo;
import fabricas.FabricaTelaVeiculo;
import interfaces.*;
import java.util.Scanner;

public class TelaAluguel {

    public static void executar(Scanner scanner, AluguelRepository  repository, AlugueService service) throws Exception {
        Cliente cliente = TelaRecuperarCliente.recuperarCliente(scanner);
        for (TipoVeiculo tipoVeiculo : TipoVeiculo.values()) {
            System.out.printf("Opção (%d) - %s \n", tipoVeiculo.getOpcao(), tipoVeiculo.getLabel());
        }
        TipoVeiculo opcaoVeiculo = TipoVeiculo.fromOpcao(scanner.nextInt());
        Veiculo veiculo = FabricaTelaVeiculo.getInstance(opcaoVeiculo);
        System.out.println("Digite a quantidade de dias de aluguel: ");
        int dias = scanner.nextInt();
        System.out.printf("Veículo: %s \nPeríodo: %d dias \nValor total: %.2f \n", opcaoVeiculo.getLabel(), dias, service.calcularAluguel(cliente,veiculo,dias));

        String opcaoAluguel;
        do {
            System.out.println("Deseja alugar? digite (s) para sim ou (n) não");
            opcaoAluguel = scanner.next();
        } while (opcaoAluguel.equalsIgnoreCase("s") && opcaoAluguel.equalsIgnoreCase("n"));

        if(opcaoAluguel.equals("s")){
            service.alugar(veiculo, cliente, dias);
            System.out.println("Veículo alugado com sucesso!");
        } else{
            System.out.println("Agradecemos o orçamento! ");
        }

    }
}
