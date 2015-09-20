package test.Strategy;


import main.Exception.InvalidMinValueException;
import main.Strategy.OverTimePayStrategy;
import main.TiposFuncionarios.PayStrategy;
import main.Types.Salary;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OverTimePayStrategyTest {

    private PayStrategy payStrategy;


    @Test(expected = InvalidMinValueException.class)
    public void returnExceptionIfSalaryIsSmall1000() throws Exception{
        payStrategy = new OverTimePayStrategy(new Salary(900),500);

        assertThat(payStrategy.calculateSalary(), is(500.0));
    }
}
