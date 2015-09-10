package Testes;


import TiposFuncionarios.Salesman;
import Types.*;
import org.junit.Test;

public class SalesmanTest {

    @Test(expected = NullPointerException.class)

    public void ifTotalSalesIsZero() throws Exception{

        Salesman salesman = new Salesman(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new Salary(1200)
        );
         salesman.toPay();
}
}
