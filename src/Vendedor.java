import Types.*;

public class Vendedor  extends Funcionario {
    private double salarioBruto = 2.000;
    private double totalVendasMes;
    private String cargo = "Vendedor";


    public Vendedor( NumeroCadastro numeroCadastro, Nome nome, SobreNome sobreNome,
                     NomeGostaSerChamado nomeGostaSerChamado,
                     Rua rua, NumeroCasa numeroCasa, Complemento complemento, Bairro bairro){
        super(numeroCadastro, nome, sobreNome, nomeGostaSerChamado, rua, numeroCasa, complemento, bairro);
    }

    public void setTotalVendasMes(double valor){
        this.totalVendasMes = valor;
    }

    public double retornaTotalVendasMes(){
        return  totalVendasMes;
    }


    public double retornaSalarioFinal(){
        return  salarioBruto +   totalVendasMes * 10/100    ;

    }


}
