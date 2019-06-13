package com.Overcons;

public class Overload {

	String name;
	int age;
	int id;
	
	public Overload(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Student 1:\nName:"+name+"\tAge:"+age);
	}
	
	public Overload(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
		System.out.println("\nStudent 2:\nName:"+name+"\tAge:"+age+"\tID:"+id);
	}
	
	public static void main(String[] args) {
	
		Overload ov=new Overload("Raj",19);
		Overload ovr=new Overload("Nikhil",18,150);
	
	}

}
