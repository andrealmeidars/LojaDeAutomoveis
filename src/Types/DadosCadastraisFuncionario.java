package Types;

public class DadosCadastraisFuncionario {
    private static String rua;
    private static double numeroCasa;
    private static String complemento;
    private static String bairro;
    private static  double salarioBruto;


    public DadosCadastraisFuncionario(String rua, double numeroCasa, String complemento, String bairro, double salarioBruto) {
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.bairro = bairro;
        this.salarioBruto = salarioBruto;
    }

    public String getRua() {
        return rua;
    }

    public  void setRua(String rua) {
        this.rua = rua;
    }

    public  double getNumeroCasa() {
        return numeroCasa;
    }

    public  void setNumeroCasa(double numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public  double getSalarioBruto (){
        return this.salarioBruto = salarioBruto;
    }
}


