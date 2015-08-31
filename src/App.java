import Types.*;

public class App {

    public static void main(String[] args) {

        Imprime imprime = new Imprime();




        Pessoa pessoa = new Pessoa(new NumeroCadastro(123), new Nome("Joao"), new SobreNome("Amadeu"),
                new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
                new Complemento("Fundos"), new Bairro("Chacara")) {
        };

        Vendedor vendedor = new Vendedor(pessoa);
        vendedor.setTotalVendasMes(1000);


        imprime.imprimeNaTela(vendedor.retornaTipoFuncionario() + " - "  + vendedor.calculaBonificacao());

    }
}





