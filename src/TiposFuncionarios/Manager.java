package TiposFuncionarios;


import Types.*;

public class Manager implements payMethod {
    private PrintConsole print;
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private Salary salary;
    private double overTimeCount;


    public Manager(Id id, CompleteName completeName, LikeName likeName, Address address, Salary salary, double overTimeCount) {
        this.id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = new TypeOfEmployee("Manager");
        this.salary = salary;
        this.overTimeCount = overTimeCount;
    }


    public void toPay() {

        double overTimeValue = (salary.getSalary() * 2) / 100;

        double valueTopay =   overTimeValue * overTimeCount;
        print.printOutPut(completeName.getName(), typeOfEmployee.getEmployee(), valueTopay);

    }
}
