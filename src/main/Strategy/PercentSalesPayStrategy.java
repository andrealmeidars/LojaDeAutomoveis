package main.Strategy;


import main.TiposFuncionarios.PayStrategy;
import main.Types.CompleteName;
import main.Types.Salary;
import main.Types.TypeOfEmployee;


public class PercentSalesPayStrategy implements PayStrategy{
    private static final int BONUS_PERCENTAGE = 10;
    private CompleteName completeName;
    private TypeOfEmployee typeOfEmployee;
    private Salary salary;
    private double totalSales;


    public PercentSalesPayStrategy(Salary salary, double totalSales) {
        this.salary = salary;
        this.totalSales = totalSales;
    }

    public double calculateSalary(){
        return salary.getSalary() + ((totalSales * BONUS_PERCENTAGE) / 100);
    }

    public  String getName(){
        return completeName.getName();
    }

    public String getTypeOfEmployee (){
        return typeOfEmployee.getEmployee();
    }
}
