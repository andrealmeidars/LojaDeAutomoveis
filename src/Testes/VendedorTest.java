package Testes;

import TiposFuncionarios.Vendedor;
import Types.DadosCadastraisFuncionario;
import Types.ImprimeTela;
import Types.NomeFuncionario;
import org.junit.Test;

public class VendedorTest {

    @Test(expected = NullPointerException.class)
    public void deveRetornarExceptionSeTotalVendasForZero() throws Exception{

        ImprimeTela imprime = new ImprimeTela();

        Vendedor vendedor = new Vendedor(
                new NomeFuncionario(234, "Pedro",  "Assis", "Pedrao")  ,
                new DadosCadastraisFuncionario("Flores Dias ", 122, "fundos", " Tristeza", 2000 )
        );


        vendedor.calculaBonificacao();



    }
}
