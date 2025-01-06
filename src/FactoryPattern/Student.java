package FactoryPattern;

public class Student extends Person{
    private String course;
    private int rollNo;

    public Student(String name, String address, AadharDetails aadharDetails,String course ,int rollNo) {
        super(name, address, aadharDetails);
        System.out.println("Student constructor called");
        this.course = course;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
