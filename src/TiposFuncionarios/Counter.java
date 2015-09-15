package TiposFuncionarios;


import Types.*;

public class Counter implements Employee{
    private Id id;
    private CompleteName completeName;
    private LikeName likeName;
    private Address address;
    private TypeOfEmployee typeOfEmployee;
    private  PayStrategy payStrategy;


    public Counter(Id id, CompleteName completeName, LikeName likeName, Address address, PayStrategy payStrategy) {
        this.id = id;
        this.completeName = completeName;
        this.likeName = likeName;
        this.address = address;
        this.typeOfEmployee = new TypeOfEmployee("Counter");
        this.payStrategy = payStrategy;
    }


    @Override
    public double getSalary() {
        return  payStrategy.calculateSalary();
    }
}
