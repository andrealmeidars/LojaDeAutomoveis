package TiposFuncionarios;

import Types.*;

public class Salesman implements Bonifica{
    private ImprimeTela imprime;
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private Salary salary;
    private double totalVendasMes = 0;


    public Salesman(Id id, CompleteName completeName, LikeName likeName, Address address, TypeOfEmployee typeOfEmployee, Salary salary) {
        this. id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = typeOfEmployee;
        this.salary = salary;
    }

    public void setAllSales(double value){
        this.totalVendasMes = value;
    }


    public void sendToPrint(ImprimeTela imprime){
       // System.out.print"dentro da funcao");
       // imprime.imprimeNatela(getNome(), this.getTipoFuncionario(), calculaBonificacao());
    }



    public double toPay() {

//            if (getTotalVendasMes() <= 0) {
//                throw  new NullPointerException();
//        }
//        // 10% do total de vendas
//       return  dadosCadastraisFuncionario.getSalarioBruto() + ((totalVendasMes * 10)/100);
    return 0;
    }
}
