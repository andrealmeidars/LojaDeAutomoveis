package TiposFuncionarios;


import Types.AbonoMensalFixo;
import Types.DadosCadastraisFuncionario;
import Types.ImprimeTela;
import Types.NomeFuncionario;

public class Advogado implements Bonifica{
    private ImprimeTela imprime;
    private NomeFuncionario nomeFuncionario;
    private DadosCadastraisFuncionario dadosCadastraisFuncionario;
    private AbonoMensalFixo abonoMensalFixo;
    private String tipoFuncionario;


    public Advogado(NomeFuncionario nomeFuncionario, DadosCadastraisFuncionario dadosCadastraisFuncionario, AbonoMensalFixo abono){
        this.nomeFuncionario = nomeFuncionario;
        this.dadosCadastraisFuncionario = dadosCadastraisFuncionario;
        this.abonoMensalFixo = abono;
        this.tipoFuncionario = "Advogado";
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
