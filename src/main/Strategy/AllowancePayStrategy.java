package main.Strategy;


import main.Exception.InvalidSalaryException;
import main.TiposFuncionarios.PayStrategy;
import main.Types.Salary;


public class AllowancePayStrategy implements PayStrategy {
    private Salary salary;
    private double allowance;


    public AllowancePayStrategy(Salary salary, double allowance) throws InvalidSalaryException {

        if (salary == null) {
            salary = new Salary(0);
        } else if (salary.getSalary() < 0) {
            throw new InvalidSalaryException("Salario não pode ser negativo");
        }
        this.salary = salary;
        this.allowance = allowance;
    }


    @Override
    public double calculateSalary() {
        return salary.getSalary() + allowance;
    }
}
