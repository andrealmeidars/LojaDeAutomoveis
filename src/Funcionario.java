import Types.*;

abstract class Funcionario {
    private NumeroCadastro numeroCadastro;
    private Nome nome;
    private SobreNome sobreNome;
    private NomeGostaSerChamado nomeGostaSerChamado;
    private Rua rua;
    private NumeroCasa numeroCasa;
    private Complemento complemento;
    private Bairro bairro;



    public Funcionario(NumeroCadastro numeroCadastro, Nome nome, SobreNome sobreNome, NomeGostaSerChamado nomeGostaSerChamado,
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



}
