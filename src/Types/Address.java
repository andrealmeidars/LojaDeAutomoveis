package Types;


public class Address {
    private String street;
    private double number;
    private String complement;
    private  String neighborhood;

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
