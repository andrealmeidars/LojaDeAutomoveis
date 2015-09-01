package Testes;

import TiposFuncionarios.Advogado;
import TiposFuncionarios.Pessoa;
import Types.*;
import org.junit.Test;

public class AdvogadoTeste {

    Pessoa pessoa = new Pessoa(new NumeroCadastro(123), new Nome("Joao"), new SobreNome("Amadeu"),
            new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
            new Complemento("Fundos"), new Bairro("Chacara")) ;

    Advogado advogado = new Advogado(pessoa);


    @Test
        public void retornaNUllPointExceptionSeNumeroCadastroForNegativo() throws Exception{
        //assertThat(advogado.getNumeroCasa(), is(not(10)));
        System.out.println(advogado.getNome());
        System.out.println("teste");





    }

}
