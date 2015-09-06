import TiposFuncionarios.Contador;
import TiposFuncionarios.Gerente;
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
        vendedor.enviaParaImpressaoSalario(imprime);

        Contador contador = new Contador(
                new NomeFuncionario(234, "Joao",  "Assis", "Jo")  ,
                new DadosCadastraisFuncionario("Flores Dias ", 122, "fundos", " Tristeza", 1500 ) ,
                new AbonoMensalFixo(4000)
        );

        contador.enviaParaImpressaoSalario(imprime);


        Gerente gerente = new Gerente(
                new NomeFuncionario(234, "Andre",  "Assis", "De")  ,
                new DadosCadastraisFuncionario("Flores Dias ", 122, "fundos", " Tristeza", 1500 ) ,
                new AbonoMensalFixo(7000)
        );

        gerente.enviaParaImpressaoSalario(imprime);



 }
}





