import TiposFuncionarios.Salesman;
import Types.*;

public class App {

    public static void main(String[] args) {

         Salesman salesman = new Salesman(
             new Id(1234),
             new CompleteName("Joao", "Gonçalves"),
             new LikeName("Jo"),
             new Address("Rua x", 122, "Fundos", "Tristeza"),
             new TypeOfEmployee("Salesman"),
             new Salary(1200)
    );
        salesman.setTotalSales(1000);
        salesman.toPay();







 }
}





