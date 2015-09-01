package TiposFuncionarios;


public class Advogado extends Pessoa implements Bonifica {
    private double salarioBruto;
    private double abonoFixo;
    private String tipoFuncionario;

    public Advogado(Pessoa pessoa){
        super(pessoa.getNumeroCadastro(), pessoa.getNome(), pessoa.getSobreNome(),
                pessoa.getNomeGostaSerChamado(), pessoa.getRua(), pessoa.getNumeroCasa(), pessoa.getComplemento(),
                pessoa.getBairro());
        this.salarioBruto = 2000;
        this.tipoFuncionario = "Advogado";
    }


    @Override
    public double calculaBonificacao() {
        return salarioBruto + abonoFixo;
    }

    public String retornaTipoFuncionario(){
        return this.tipoFuncionario;

    }





    public void setAbonoFixo(double value){
        this.abonoFixo = value;
    }


}
