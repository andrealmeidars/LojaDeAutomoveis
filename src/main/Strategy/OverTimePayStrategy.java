package main.Strategy;


import main.Exception.InvalidMinValueException;
import main.TiposFuncionarios.PayStrategy;
import main.Types.Salary;


    public class OverTimePayStrategy implements  PayStrategy {
        private static final int BONUS_OVERTIME = 2;
        private Salary salary;
        private double overTimeCount;



        public OverTimePayStrategy(Salary salary, double overtTimeValue) throws InvalidMinValueException{

            if (salary.getSalary() < 1000) {
                throw new InvalidMinValueException("Salario não pode ser menor que 1000");
            }
            this.salary = salary;
            this.overTimeCount = overtTimeValue;
        }

        @Override
        public double calculateSalary() {
            return salary.getSalary() + (overTimeCount * ((salary.getSalary() * BONUS_OVERTIME) / 100));
        }




    }
