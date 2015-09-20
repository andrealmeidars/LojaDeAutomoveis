package test.Strategy;

import main.Exception.InvalidSalaryException;
import main.Strategy.AllowancePayStrategy;
import main.TiposFuncionarios.PayStrategy;
import main.Types.Salary;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AllowanceSalesPayStrategyTest {


    private PayStrategy payStrategy;

    @Test
    public void calcularesSalary() throws InvalidSalaryException {
        payStrategy = new AllowancePayStrategy(new Salary(2000),500);

        assertThat(payStrategy.calculateSalary(), is(2500.0));
    }

    @Test (expected = InvalidSalaryException.class)
    public void throwsExceptionWhenNagativeSalaryIsPassed() throws Exception {
        payStrategy = new AllowancePayStrategy(new Salary(-5),500);
    }

    @Test
    public void returnsOnlyBonusWhenSalaryIsNull() throws Exception {
        payStrategy = new AllowancePayStrategy(null,500);

        assertThat(payStrategy.calculateSalary(), is(500.0));
    }
}
