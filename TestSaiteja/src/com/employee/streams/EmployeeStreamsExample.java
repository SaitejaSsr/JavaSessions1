package com.employee.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamsExample {

    public static void main(String[] args) {
    	
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "ravi", 12000f));
        employees.add(new Employee(2, "kumar", 6000f));
        employees.add(new Employee(3, "rajesh", 42000f));
        employees.add(new Employee(4, "ram", 22000f));

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by name: " + sortedEmployees);

        List<Employee> revSortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("Employees sorted by name (reversed): " + revSortedEmployees);
    }
}