package CodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    private String name;
    private int salary;

    public Emp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<Emp> employees= Arrays.asList(
                new Emp("rushikesh",80000),
                new Emp("krishna",70000),
                new Emp("avinash",60000),
                new Emp("sumit",90000)
                );

        List<Emp> sortEmp=employees.stream()
                .sorted(Comparator.comparingInt(Emp::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Sorted Employees: " + sortEmp);

    }
}
