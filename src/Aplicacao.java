
import entidades.Menu;
import interfaces.*;
import repository.AluguelRepositoryImp;
import repository.ClienteRepositoryImp;
import service.Alugue;
import service.ClienteServiceImp;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        AluguelRepository repository = new AluguelRepositoryImp();

        AlugueService serviceAlugue = new Alugue(repository);
        ClienteService serviceCliente = new ClienteServiceImp(ClienteRepositoryImp.getInstance());

        Menu.executar(scanner, repository, serviceAlugue, serviceCliente);



    }
}
