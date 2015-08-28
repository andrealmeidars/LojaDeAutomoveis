package Types;


public class NomeGostaSerChamado {
    private String nomeFavorito;

    public NomeGostaSerChamado(String nomeFavorito){
        this.nomeFavorito = nomeFavorito;
    }

    public String getNome(){
        return this.nomeFavorito;
    }
}
