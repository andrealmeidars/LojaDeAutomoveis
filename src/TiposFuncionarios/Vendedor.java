package TiposFuncionarios;

import Types.DadosCadastraisFuncionario;
import Types.ImprimeTela;
import Types.NomeFuncionario;

public class Vendedor  implements Bonifica{
    private ImprimeTela imprime;
    private NomeFuncionario nomeFuncionario;
    private  DadosCadastraisFuncionario dadosCadastraisFuncionario;
    private double totalVendasMes = 0;
    private String tipoFuncionario;


    public Vendedor (NomeFuncionario nomeFuncionario, DadosCadastraisFuncionario dadosCadastraisFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.dadosCadastraisFuncionario = dadosCadastraisFuncionario;
        this.tipoFuncionario = "Vendedor";

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

    public void setTotalVendasMes(double totalVendasMes){
        this.totalVendasMes = totalVendasMes;
    }

    public void enviaParaImpressaoSalario(ImprimeTela imprime){
       // System.out.print"dentro da funcao");
        imprime.imprimeNatela(this.getTipoFuncionario(), calculaBonificacao());
    }



    public double calculaBonificacao() {

            if (totalVendasMes < 0) {
                return dadosCadastraisFuncionario.getSalarioBruto();
        }
        // 10% do total de vendas
       return  dadosCadastraisFuncionario.getSalarioBruto() + ((totalVendasMes * 10)/100);
    }
}
