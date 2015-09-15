package Strategy;


import TiposFuncionarios.Employee;
import TiposFuncionarios.PayStrategy;
import Types.CompleteName;
import Types.Salary;
import Types.TypeOfEmployee;

    public class AllowancePayStrategy implements PayStrategy {
        private Salary salary;
        private CompleteName completeName;
        private TypeOfEmployee typeOfEmployee;
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
