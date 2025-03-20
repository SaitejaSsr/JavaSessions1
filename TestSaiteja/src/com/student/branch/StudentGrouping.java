package com.student.branch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrouping {

    String name;
    int age;
    String branch;

    public StudentGrouping(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Branch: " + branch;
    }

    public static void main(String[] args) {
        ArrayList<StudentGrouping> students = new ArrayList<>();

        students.add(new StudentGrouping("Arun", 20, "CSE"));
        students.add(new StudentGrouping("Barath", 21, "EEE"));
        students.add(new StudentGrouping("Kiran", 22, "Mech"));
        students.add(new StudentGrouping("Dheeraj", 19, "Civil"));
        students.add(new StudentGrouping("Rajesh", 20, "IT"));
        students.add(new StudentGrouping("Suraj", 19, "Mech"));
        students.add(new StudentGrouping("Mayank", 23, "ECE"));
        students.add(new StudentGrouping("Soumit", 21, "ECE"));
        students.add(new StudentGrouping("Mayank", 23, "EEE"));
        students.add(new StudentGrouping("Stephen", 19, "CSE"));
        students.add(new StudentGrouping("Kumar", 18, "Mech"));
        students.add(new StudentGrouping("Naresh", 21, "Civil"));
        students.add(new StudentGrouping("Ramesh", 19, "IT"));



        Map<String, List<StudentGrouping>> studentsByBranch = new HashMap<>();

        for (StudentGrouping student : students) {
            String branch = student.branch;
            studentsByBranch.putIfAbsent(branch, new ArrayList<>());
            studentsByBranch.get(branch).add(student);
        }

        System.out.println("Students Grouped by Branch:");
        for (Map.Entry<String, List<StudentGrouping>> entry : studentsByBranch.entrySet()) {
            String branch = entry.getKey();
            List<StudentGrouping> studentList = entry.getValue();
            System.out.println("\nBranch: " + branch);
            for (StudentGrouping student : studentList) {
                System.out.println(student);
            }
        }
    }
}