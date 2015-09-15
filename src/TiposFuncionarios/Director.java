package TiposFuncionarios;

import Types.*;


public class Director implements Employee {
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private PayStrategy payStrategy;




    public Director(Id id, CompleteName completeName, LikeName likeName, Address address, PayStrategy payStrategyt) {
        this.id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = new TypeOfEmployee("Director");
        this.payStrategy = payStrategyt;

    }

    @Override
    public double getSalary(){
        return  payStrategy.calculateSalary();
    }

    public  String getName(){
        return completeName.getName();
    }

    public String getTypeOfEmployee (){
        return typeOfEmployee.getEmployee();
    }
}
