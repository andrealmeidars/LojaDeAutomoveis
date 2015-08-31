import TiposFuncionarios.Advogado;
import TiposFuncionarios.Pessoa;
import Types.*;

public class App {

    public static void main(String[] args) {

        Imprime imprime = new Imprime();




        Pessoa pessoa = new Pessoa(new NumeroCadastro(123), new Nome("Joao"), new SobreNome("Amadeu"),
                new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
                new Complemento("Fundos"), new Bairro("Chacara")) {
        };

//        Vendedor vendedor = new Vendedor(pessoa);
//        vendedor.setTotalVendasMes(1000);
//        imprime.imprimeNaTela(vendedor.retornaTipoFuncionario() + " - " + vendedor.calculaBonificacao());

//        Contador contador = new Contador(pessoa);
//        contador.setAbonoFixo(7000);
//        imprime.imprimeNaTela(contador.retornaTipoFuncionario() + " - " + contador.calculaBonificacao());


        Advogado advogado = new Advogado(pessoa);
        advogado.setAbonoFixo(9000);
        imprime.imprimeNaTela(advogado.retornaTipoFuncionario() + " - " + advogado.calculaBonificacao());









    }
}





