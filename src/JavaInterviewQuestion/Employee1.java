package JavaInterviewQuestion;

import java.util.*;
import java.util.stream.*;

class Employee1 {
    String name;
    double salary;
    String designation;

    public Employee1(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return name;
    }
}

 class FilterEmployees {
    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("John", 60000, "Developer"),
                new Employee1("Jane", 40000, "Tester"),
                new Employee1("Mark", 70000, "Developer")
        );

        List<Employee1> filteredEmployees = employees.stream()
                .filter(e -> e.salary > 60000 && "Developer".equals(e.designation))
                .collect(Collectors.toList());

        System.out.println("Filtered Employees: " + filteredEmployees);
    }
}

