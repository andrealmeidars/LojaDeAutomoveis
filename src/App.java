import Types.*;

public class App {

    public static void main(String[] args) {

        Imprime imprime = new Imprime();




        Funcionario vendedor = new Vendedor(new NumeroCadastro(123), new Nome("Joao"),new SobreNome("Amadeu"),
                               new NomeGostaSerChamado("Jo"), new Rua("Rua das Flores"), new NumeroCasa(12),
                               new Complemento("Fundos"), new Bairro("Chacara") );


        vendedor.setTotalVendasMes(1000);
        imprime.imprimeBonificacao(vendedor);

    }
}





