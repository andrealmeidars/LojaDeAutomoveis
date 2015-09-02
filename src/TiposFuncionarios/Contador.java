package TiposFuncionarios;


import Types.AbonoMensalFixo;
import Types.DadosCadastraisFuncionario;
import Types.ImprimeTela;
import Types.NomeFuncionario;

public class Contador implements Bonifica {
    private ImprimeTela imprime;
    private NomeFuncionario nomeFuncionario;
    private DadosCadastraisFuncionario dadosCadastraisFuncionario;
    private AbonoMensalFixo abonoMensalFixo;
   // private double abonoFixo = 0;
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

    public String getSobreNome(){
        return nomeFuncionario.getSobreNome();
    }

    public String gerNomeQueMaisGosta(){
        return nomeFuncionario.getNomeQueMaisGosta();
    }

    public String getNomeRua(){
        return dadosCadastraisFuncionario.getRua();
    }

    public double getNumeroCasa(){
        return dadosCadastraisFuncionario.getNumeroCasa();
    }

    public String getComplemento(){
        return dadosCadastraisFuncionario.getComplemento();
    }

    public String getBairro(){
        return dadosCadastraisFuncionario.getBairro();
    }

    public void enviaParaImpressaoSalario(ImprimeTela imprime){

        imprime.imprimeNatela(this.getTipoFuncionario(), calculaBonificacao());
    }

    public double calculaBonificacao() {

        return  dadosCadastraisFuncionario.getSalarioBruto() + abonoMensalFixo.getAbonoMensalFixo();
    }


}
