package main.Types;


public class CompleteName {
    private final String name;
    private final String lastName;

    public CompleteName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
