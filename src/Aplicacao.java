import entidades.Alugue;
import entidades.ClientePJImp;
import entidades.VeiculoGrande;
import interfaces.Cliente;
import interfaces.Veiculo;

public class Aplicacao {
    public static void main(String[] args) {
        Cliente cliente = new ClientePJImp("Isabella", "12012313541564");
        Veiculo van =  new VeiculoGrande();
        Alugue alguel = new Alugue(cliente,van, 2);
        System.out.printf("%.2f", alguel.calcularAluguel());

    }
}
