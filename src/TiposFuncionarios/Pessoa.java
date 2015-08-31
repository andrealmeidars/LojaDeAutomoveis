package TiposFuncionarios;

import Types.*;

public class Pessoa {
    private NumeroCadastro numeroCadastro;
    private Nome nome;
    private SobreNome sobreNome;
    private NomeGostaSerChamado nomeGostaSerChamado;
    private Rua rua;
    private NumeroCasa numeroCasa;
    private Complemento complemento;
    private Bairro bairro;



    public Pessoa(NumeroCadastro numeroCadastro, Nome nome, SobreNome sobreNome, NomeGostaSerChamado nomeGostaSerChamado,
                  Rua rua, NumeroCasa numeroCasa, Complemento complemento, Bairro bairro){
        this.numeroCadastro = numeroCadastro;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nomeGostaSerChamado = nomeGostaSerChamado;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.bairro = bairro;

    }

    public NumeroCadastro getNumeroCadastro() {
        return numeroCadastro;
    }

    public Nome getNome() {
        return nome;
    }

    public SobreNome getSobreNome() {
            if (sobreNome == null) {
                return null;
            }
        return sobreNome;
    }

    public void setSobreNome(SobreNome sobreNome) {
        this.sobreNome = sobreNome;
    }

    public NomeGostaSerChamado getNomeGostaSerChamado() {
        return nomeGostaSerChamado;
    }

    public Rua getRua() {
        return rua;
    }

    public NumeroCasa getNumeroCasa() {
        return numeroCasa;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

   // abstract double calculaBonificacao();
    //abstract void setTotalVendasMes(double valor);



}
