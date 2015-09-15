package Strategy;



import TiposFuncionarios.PayStrategy;
import Types.Salary;


    public class AllowancePayStrategy implements PayStrategy {
        private Salary salary;
        private double allowance;


    public AllowancePayStrategy(Salary salary, double allowance) {
        this.salary = salary;
        this.allowance = allowance;
    }


    @Override
    public double calculateSalary() {
        return salary.getSalary() + allowance;
    }
}
