package Types;


public class NomeFuncionario {
    private static double numeroCadastro;
    private  static String nome;
    private  static String sobreNome;
    private  static String nomeQueMaisGosta;



    public NomeFuncionario (double numeroCadastro, String nome, String sobreNome, String nomeQueMaisGosta){
        this.numeroCadastro = numeroCadastro;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nomeQueMaisGosta = nomeQueMaisGosta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public  String getNomeQueMaisGosta() {
        return nomeQueMaisGosta;
    }

    public void setNomeQueMaisGosta(String nomeQueMaisGosta) {
        this.nomeQueMaisGosta = nomeQueMaisGosta;
    }
}




