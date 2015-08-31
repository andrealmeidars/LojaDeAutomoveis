package Testes;


import TiposFuncionarios.Pessoa;
import TiposFuncionarios.Vendedor;
import Types.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class vendedorTeste {

    Pessoa pessoa = new Pessoa(new NumeroCadastro(123), new Nome("Joao"), new SobreNome("Amadeu"),
            new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
            new Complemento("Fundos"), new Bairro("Chacara")) {
    };

    Vendedor vendedor = new Vendedor(pessoa);

    @Test(expected = NullPointerException.class)
    public void retornaExceptionSeBonificacaoNaoForInserida() throws Exception{

        vendedor.calculaBonificacao();

     }

    @Test
    public void retornaSeSalarioForIgual2000() throws Exception{

        assertThat(vendedor.retornaSalario(), is(2000.0));
    }


}
