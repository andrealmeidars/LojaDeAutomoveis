package main;

import main.Exception.InvalidMinValueException;
import main.Exception.InvalidSalaryException;
import main.Strategy.AllowancePayStrategy;
import main.Strategy.OverTimePayStrategy;
import main.Strategy.PercentSalesPayStrategy;
import main.TiposFuncionarios.*;
import main.Types.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws InvalidSalaryException, InvalidMinValueException {

        PrintConsole print = new PrintConsole();

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



        List<Employee> employees = new ArrayList<>();
        employees.add(salesman);
        employees.add(counter);
        employees.add(lawyer);
        employees.add(manager);
        employees.add(director);


        for (Employee employee : employees){

            print.printOutPut(employee.getName(), employee.getTypeOfEmployee(), employee.getSalary());

        }









 }
}





