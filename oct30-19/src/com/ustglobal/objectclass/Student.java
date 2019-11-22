package com.ustglobal.objectclass;

public class Student {
	int id;
	String name;
	double  percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@override
	public int hashCode() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	void display() {
		System.out.println("name is "+name + " id is "+ id   +"percentage is "+ percentage);
	}

}
