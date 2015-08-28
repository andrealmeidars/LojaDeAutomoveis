package Types;


public class GostaSerChamado {
    private String nomeFavorito;

    public GostaSerChamado(String nomeFavorito){
        this.nomeFavorito = nomeFavorito;
    }

    public String getNome(){
        return this.nomeFavorito;
    }
}
