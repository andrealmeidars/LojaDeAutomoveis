import Types.*;

public class DadosCadastrais {
    private NumeroCadastro numeroCadastro;
    private Nome nome;
    private SobreNome sobreNome;
    private GostaSerChamado gostaSerChamado;
    private Rua rua;
    private NumeroCasa numeroCasa;
    private Complemento complemento;
    private Bairro bairro;


    public DadosCadastrais(NumeroCadastro numeroCadastro, Nome nome, SobreNome sobreNome, GostaSerChamado gostaSerChamado,
                           Rua rua, NumeroCasa numeroCasa, Complemento complemento, Bairro bairro){
        this.numeroCadastro = numeroCadastro;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.gostaSerChamado = gostaSerChamado;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.bairro = bairro;


    }
}
