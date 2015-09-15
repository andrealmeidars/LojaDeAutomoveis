package Strategy;


import TiposFuncionarios.PayStrategy;
import Types.Salary;


public class PercentSalesPayStrategy implements PayStrategy{
    private static final int BONUS_PERCENTAGE = 10;
    private Salary salary;
    private double totalSales;


    public PercentSalesPayStrategy(Salary salary, double totalSales) {
        this.salary = salary;
        this.totalSales = totalSales;
    }

    public double calculateSalary(){
        return salary.getSalary() + ((totalSales * BONUS_PERCENTAGE) / 100);
    }
}
