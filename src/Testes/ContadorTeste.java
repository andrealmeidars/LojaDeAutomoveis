package Testes;


import TiposFuncionarios.Contador;
import TiposFuncionarios.Pessoa;
import Types.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContadorTeste {

    Pessoa pessoa = new Pessoa(new NumeroCadastro(123), new Nome("Joao"), new SobreNome("Amadeu"),
            new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
            new Complemento("Fundos"), new Bairro("Chacara"));


    Contador contador = new Contador(pessoa);

    @Test
    public void retornaErroSeNomeCargoEstiverErrado() throws Exception{
        assertThat(contador.retornaTipoFuncionario(), is ("Contador"));

     }
}
