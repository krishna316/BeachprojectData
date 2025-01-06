package FactorypatternTest;

import FactoryPattern.AadharDetails;
import FactoryPattern.Employee;
import FactoryPattern.Person;
import FactoryPatternProjects.PersonFactory;

public class FactoryPatternTest {
    public static void main(String[] args) {
//        System.out.println("Factory Pattern Test");
//        AadharDetails aadharDetails = new AadharDetails(123456789, 25, 9876543210L);
//        Person customer = new Employee("raja", "hyderabad", aadharDetails, "TCS", 50000);
//        System.out.println(customer);
//
//        System.out.println("==========================================");
//        AadharDetails aadharDetails1 = new AadharDetails(123454589, 26, 9876548710L);
//        Person student = new Employee("ravi", "bangalore", aadharDetails1, "CSE", 101);
//        System.out.println(student);

          Person emp= PersonFactory.getInstance("emp");
          System.out.println(emp);
          System.out.println("==========================================");

          Person stu= PersonFactory.getInstance("stu");
            System.out.println(stu);
    }
}
