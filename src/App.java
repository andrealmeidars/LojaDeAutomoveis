import TiposFuncionarios.Vendedor;
import Types.*;

public class App {

    public static void main(String[] args) {

        ImprimeTela imprime = new ImprimeTela();



         Vendedor vendedor = new Vendedor(
             new Id(1234),
             new CompleteName("Joao", "Gonçalves"),
             new LikeName("Jo"),
             new Address("Rua x", 122, "Fundos", "Tristeza"),
             new TypeOfEmployee("Vendedor"),
             new Salary(1200)
    );
        vendedor.setTotalVendasMes(1000);







 }
}





