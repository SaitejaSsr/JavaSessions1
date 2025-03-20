package com.student.mgmt;

import java.util.ArrayList;

public class Student {

	    String name;
	    int age;
	    public String branch;

	    public Student(String name, int age, String branch) {
	        this.name = name;
	        this.age = age;
	        this.branch = branch;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Age: " + age + ", Branch: " + branch;
	    }

	    public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();

	        students.add(new Student("Arun", 20, "CSE"));
	        students.add(new Student("Barath", 21, "EEE"));
	        students.add(new Student("Kiran", 22, "Mech"));
	        students.add(new Student("Dheeraj", 19, "Civil"));
	        students.add(new Student("Rajesh", 20, "IT"));
	        students.add(new Student("Suraj", 19, "Mech"));
	        students.add(new Student("Mayank", 23, "ECE"));
	        students.add(new Student("Soumit", 21, "ECE"));
	        students.add(new Student("Mayank", 23, "EEE"));
	        students.add(new Student("Stephen", 19, "CSE"));
	        students.add(new Student("Kumar", 18, "Mech"));

	        
	        System.out.println("Student Details:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}
	
