package TiposFuncionarios;


import Types.ImprimeTela;

public class Contador implements Bonifica {
    private ImprimeTela imprime;
    private NomeFuncionario nomeFuncionario;
    private DadosCadastraisFuncionario dadosCadastraisFuncionario;
    private AbonoMensalFixo abonoMensalFixo;
    private String tipoFuncionario;

    public Contador(NomeFuncionario nomeFuncionario, DadosCadastraisFuncionario dadosCadastraisFuncionario, AbonoMensalFixo abono){
        this.nomeFuncionario = nomeFuncionario;
        this.dadosCadastraisFuncionario = dadosCadastraisFuncionario;
        this.abonoMensalFixo = abono;
        this.tipoFuncionario = "Contador";
    }

    public String getNome (){
        return nomeFuncionario.getNome();
    }

    public String getTipoFuncionario(){
        return tipoFuncionario;
    }



    public void enviaParaImpressaoSalario(ImprimeTela imprime){

        imprime.imprimeNatela(getNome(), this.getTipoFuncionario(), calculaBonificacao());
    }

    public double calculaBonificacao() {

        return  dadosCadastraisFuncionario.getSalarioBruto() + abonoMensalFixo.getAbonoMensalFixo();
    }


}
