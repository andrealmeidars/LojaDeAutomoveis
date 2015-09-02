import TiposFuncionarios.Contador;
import TiposFuncionarios.Vendedor;
import Types.AbonoMensalFixo;
import Types.DadosCadastraisFuncionario;
import Types.ImprimeTela;
import Types.NomeFuncionario;

public class App {

    public static void main(String[] args) {

        ImprimeTela imprime = new ImprimeTela();




        Vendedor vendedor = new Vendedor(
                new NomeFuncionario(234, "Pedro",  "Assis", "Pedrao")  ,
                new DadosCadastraisFuncionario("Flores Dias ", 122, "fundos", " Tristeza", 2000 )
        );

        vendedor.setTotalVendasMes(1000);
        vendedor.enviaParaImpressaoSalario(imprime);

        Contador contador = new Contador(
                new NomeFuncionario(234, "Pedro",  "Assis", "Pedrao")  ,
                new DadosCadastraisFuncionario("Flores Dias ", 122, "fundos", " Tristeza", 1500 ) ,
                new AbonoMensalFixo(4000)
        );

        contador.enviaParaImpressaoSalario(imprime);



 }
}





