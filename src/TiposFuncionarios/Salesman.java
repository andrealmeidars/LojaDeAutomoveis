package TiposFuncionarios;

import Types.*;

public class Salesman implements payMethod {
    private PrintConsole print;
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private Salary salary;
    private double totalSales;


    public Salesman(Id id, CompleteName completeName, LikeName likeName, Address address, TypeOfEmployee typeOfEmployee, Salary salary) {
        this. id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = typeOfEmployee;
        this.salary = salary;
        this.print = new PrintConsole();
    }

    public void setTotalSales(double value){
        this.totalSales = value;
    }


    public void toPay() {

        double valueTopay =  salary.getSalary() + ((totalSales * 10)/100);
        print.printOutPut(completeName.getName(), typeOfEmployee.getEmployee(), valueTopay);

    }
}
