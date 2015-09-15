package Strategy;


import TiposFuncionarios.PayStrategy;
import Types.CompleteName;
import Types.Salary;
import Types.TypeOfEmployee;

    public class OverTimePayStrategy implements  PayStrategy {
        private static final int BONUS_OVERTIME = 2;
        private Salary salary;
        private CompleteName completeName;
        private TypeOfEmployee typeOfEmployee;
        private double overTimeCount;



        public OverTimePayStrategy(Salary salary, double overtTimeValue) {
            this.salary = salary;
            this.overTimeCount = overtTimeValue;
        }

        @Override
        public double calculateSalary() {
            return salary.getSalary() + (overTimeCount * ((salary.getSalary() * BONUS_OVERTIME) / 100));
        }




    }
