package Strategy;


import TiposFuncionarios.PayStrategy;
import Types.CompleteName;
import Types.Salary;
import Types.TypeOfEmployee;

public class PercentSalesPayStrategy implements PayStrategy{
    private static final int BONUS_PERCENTAGE = 10;
    private Salary salary;
    private CompleteName completeName;
    private TypeOfEmployee typeOfEmployee;
    private double totalSales;


    public PercentSalesPayStrategy(Salary salary, double totalSales) {
        this.salary = salary;
        this.totalSales = totalSales;
    }

    public double calculateSalary(){
        return salary.getSalary() + ((totalSales * BONUS_PERCENTAGE) / 100);
    }
}
