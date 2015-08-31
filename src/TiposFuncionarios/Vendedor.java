package TiposFuncionarios;

public class Vendedor extends Pessoa implements Bonifica {
    private double salarioBruto;
    private double totalVendasMes = 0;
    private String tipoFuncionario = "Vendedor";


//    public TiposFuncionarios.Vendedor( NumeroCadastro numeroCadastro, Nome nome, SobreNome sobreNome,
//                     NomeGostaSerChamado nomeGostaSerChamado,
//                     Rua rua, NumeroCasa numeroCasa, Complemento complemento, Bairro bairro){
//        super(numeroCadastro, nome, sobreNome, nomeGostaSerChamado, rua, numeroCasa, complemento, bairro);
//    }


    public Vendedor (Pessoa pessoa){
        super(pessoa.getNumeroCadastro(), pessoa.getNome(), pessoa.getSobreNome(),
                pessoa.getNomeGostaSerChamado(), pessoa.getRua(), pessoa.getNumeroCasa(), pessoa.getComplemento(),
                pessoa.getBairro());
        this.salarioBruto = 2000;

    }

    public String retornaTipoFuncionario(){
        return tipoFuncionario;
    }


    public void setTotalVendasMes(double valor){
        this.totalVendasMes = valor;
    }

    public double retornaSalario(){
        return salarioBruto;
    }


    public double calculaBonificacao(){
            if (totalVendasMes == 0) {
                    throw new NullPointerException();
            }
        return  salarioBruto +  (totalVendasMes * 10/100);
    }


}