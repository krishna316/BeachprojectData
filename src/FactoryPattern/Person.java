package FactoryPattern;

public abstract class Person {
    private String name;
    private String address;
    private AadharDetails aadharDetails;

    public Person(String name, String address, AadharDetails aadharDetails) {
        this.name = name;
        this.address = address;
        this.aadharDetails = aadharDetails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", aadharDetails=" + aadharDetails +
                '}';
    }
}
