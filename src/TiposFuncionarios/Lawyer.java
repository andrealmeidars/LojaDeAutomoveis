package TiposFuncionarios;


import Types.*;

public class Lawyer implements payMethod {
    private PrintConsole print;
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private Salary salary;
    private double allowance;


    public Lawyer(Id id, CompleteName completeName, LikeName likeName, Address address, Salary salary, double allowance) {
        this.id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = new TypeOfEmployee("Lawyer");
        this.salary = salary;
        this.allowance = allowance;
    }


    public void toPay() {

        double valueTopay =  salary.getSalary() + allowance;
        print.printOutPut(completeName.getName(), typeOfEmployee.getEmployee(), valueTopay);

    }
}