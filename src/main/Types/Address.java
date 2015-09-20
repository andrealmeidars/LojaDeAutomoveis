package main.Types;


public class Address {
    private final String street;
    private final double number;
    private final String complement;
    private  final String neighborhood;

    public Address(String street, double number, String complement, String neighborhood) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public double getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }
}
