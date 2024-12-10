package FactoryPattern;

public class Employee extends Person{
    private String company;
    private double salary;
    public Employee(String name, String address, AadharDetails aadharDetails,String company,double salary) {
        super(name, address, aadharDetails);
        System.out.println("Employee constructor called");
        this.company = company;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
