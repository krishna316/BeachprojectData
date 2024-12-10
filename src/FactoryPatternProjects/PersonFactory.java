package FactoryPatternProjects;

import FactoryPattern.AadharDetails;
import FactoryPattern.Employee;
import FactoryPattern.Person;

public class PersonFactory {
    public static Person getInstance(String personType) {
        Person per = null;
        if (personType.equalsIgnoreCase("emp")) {
            AadharDetails aadharDetails = new AadharDetails(123456789, 23, 9836543210L);
            per = new Employee("raja", "hyderabad", aadharDetails, "TCS", 50000);

        } else if (personType.equalsIgnoreCase("stu")) {
            AadharDetails aadharDetails1 = new AadharDetails(123434589, 24, 9866548710L);
            per = new Employee("ravi", "bangalore", aadharDetails1, "CSE", 101);
        } else if (personType.equalsIgnoreCase("cust")) {
            AadharDetails aadharDetails = new AadharDetails(122456789, 25, 9856543210L);
            per = new Employee("sai", "chennai", aadharDetails, "CTS", 60000);
        }
        else {
            throw new IllegalArgumentException("Invalid Person Type");
        }
        return per;

    }
}
