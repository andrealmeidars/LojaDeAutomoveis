package TiposFuncionarios;


public class Contador extends Pessoa implements Bonifica {
    private double salarioBruto;
    private double abonoFixo;
    private String tipoFuncionario;

    public Contador(Pessoa pessoa){
        super(pessoa.getNumeroCadastro(), pessoa.getNome(), pessoa.getSobreNome(),
                pessoa.getNomeGostaSerChamado(), pessoa.getRua(), pessoa.getNumeroCasa(), pessoa.getComplemento(),
                pessoa.getBairro());
        this.salarioBruto = 2000;
        this.tipoFuncionario = "Contador";
    }

    public void setAbonoFixo(double value){
        this.abonoFixo = value;
    }



    @Override
    public double calculaBonificacao() {
        return  salarioBruto + abonoFixo;
    }

    public String retornaTipoFuncionario(){
        return this.tipoFuncionario;

    }


}
