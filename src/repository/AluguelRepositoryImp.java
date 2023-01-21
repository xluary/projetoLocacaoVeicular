package repository;

import entidades.Aluguel;
import interfaces.AluguelRepository;
import interfaces.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AluguelRepositoryImp implements AluguelRepository {

    private static ArrayList<Aluguel> listaAlugueis;

    private static AluguelRepositoryImp instance;


    public static AluguelRepositoryImp getInstance(){
        if(Objects.isNull(instance)){
            instance = new AluguelRepositoryImp();
        }
        return instance;
    }

    @Override
    public void salvarAluguel(Aluguel aluguel) {
        if(Objects.isNull(listaAlugueis)){
            listaAlugueis = new ArrayList<>();
        }
        listaAlugueis.add(aluguel);
    }


    @Override
    public List<Aluguel> getListaAlugueis() {
        return this.listaAlugueis;
    }

    @Override
    public void buscarPorCliente(Cliente cliente) {
        List<Aluguel> listTemp = new ArrayList();
        if(Objects.isNull(listaAlugueis)){
            System.out.println("Nenhum aluguel cadastrado!");
        }
        for (Aluguel aluguel : listaAlugueis) {
            if(aluguel.cliente().equals(cliente)){
                listTemp.add(aluguel);
            }
        }
        if(listTemp.isEmpty()){
            System.out.println("Nenhum aluguel cadastrado nesse cliente");
        } else {
            for (Aluguel item: listTemp) {
                System.out.printf("Data: %s, Veículo: %s, Quantidade de dias: %d \n",  item.timestamp(), item.veiculo().getClass().getSimpleName(), item.quantDias());
            }
        }

    }
}
