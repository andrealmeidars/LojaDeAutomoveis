import Strategy.AllowancePayStrategy;
import Strategy.OverTimePayStrategy;
import Strategy.PercentSalesPayStrategy;
import TiposFuncionarios.*;
import Types.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Salesman salesman = new Salesman(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new AllowancePayStrategy(new Salary(50), 50));


        Counter counter = new Counter(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new PercentSalesPayStrategy(new Salary(100), 250));

        Lawyer lawyer = new Lawyer(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new PercentSalesPayStrategy(new Salary(50), 250));

        Manager manager = new Manager(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new OverTimePayStrategy(new Salary(250), 40));

        Director director = new Director(
                new Id(1234),
                new CompleteName("Joao", "Gonçalves"),
                new LikeName("Jo"),
                new Address("Rua x", 122, "Fundos", "Tristeza"),
                new OverTimePayStrategy(new Salary(250), 40));






//        salesman.calculateSalary();
//
//
//        List<Employee> employees = new ArrayList<>();
//
//        employees.add(new Counter());
//        employees.add(new Director());
//
//        for (Employee employee : employees){
//            employee.getSalary();
//        }









 }
}





