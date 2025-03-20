package com.student.streams.example;

class Student {
	int rollNo;
	String name;
	int age;
	String gender;
	String branch;

	public Student() {
	}

	public Student(int rollNo, String name, int age, String gender, String branch) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.branch = branch;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", gender=" + gender + ", branch="
				+ branch + "]";
	}

}