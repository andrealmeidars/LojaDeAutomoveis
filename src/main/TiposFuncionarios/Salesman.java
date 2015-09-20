package main.TiposFuncionarios;


import main.Types.*;

public class Salesman implements Employee {
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private  PayStrategy payStrategy;


    public Salesman(Id id, CompleteName completeName, LikeName likeName, Address address, PayStrategy payStrategy) {
        this.id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = new TypeOfEmployee("Salesman");
        this.payStrategy = payStrategy;

    }

    @Override
    public double getSalary() {
        return  payStrategy.calculateSalary();
    }

    @Override
    public  String getName(){
        return completeName.getName();
    }

    @Override
    public String getTypeOfEmployee (){
        return typeOfEmployee.getEmployee();
    }




}
