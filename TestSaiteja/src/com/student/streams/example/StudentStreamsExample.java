package com.student.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class StudentStreamsExample {

	public static void main(String[] args) {

		List<String> listNames = Arrays.asList("Ravi", "Aruna", "Sharukh Khan", "Robert");
		Map<Character, List<String>> namesByFirstLetter = listNames.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(namesByFirstLetter);

		Map<Object, Long> namesByFirstLetterCount = listNames.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
		System.out.println(namesByFirstLetterCount);
		
		
		List<Student> students = Arrays.asList(
				new Student(1, "Ravi", 16, "Male", "ECE"),
				new Student(2, "Rajeev", 17, "Male", "EEE"),
				new Student(3, "Saranya", 21, "Female", "ECE"),
				new Student(4, "Kumar", 25, "Male", "Mech"),
				new Student(5, "Prakash", 16, "Male", "ECE"),
				new Student(6, "Jaya", 16, "Female", "EEE"),
				new Student(7, "Krishna", 18, "Male", "ECE"),
				new Student(8, "Kavitha", 21, "Female", "ECE")
				);
		
		Map<Integer, List<Student>> studentsByAge = students.stream()
				.collect(Collectors.groupingBy(student -> (student.getAge()/10)*10));
		System.out.println(studentsByAge);
		

	}

}
