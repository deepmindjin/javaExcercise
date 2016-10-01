package com.study.academy.cords;

public class Student {
	// Attributes of Student
	private String name;
	private String subject;
	
	// Consturctor
	public Student(String name){
		this.name = name;
		subject = "";
	}
	
	// Check out taking this course or not (arguments for String type)
	public void inClassOrNot(String subject){
		System.out.print(this.name + "���� " + subject + " ������ ��");
		if(subject == this.subject){
			System.out.println("���ϴ�");
		}else{
			System.out.println("���ʽ��ϴ�");
		}
	}
	
	// Check out taking this course or not (arguments for ClassRoom type)
	public void inClassOrNot(ClassRoom classroom){
		System.out.print(this.name + "���� " + classroom.getSubject() + " ������ ��");
		if(classroom.getSubject() == this.subject){
			System.out.println("���ϴ�");
		}else{
			System.out.println("���ʽ��ϴ�");
		}
	}
	
	// From this line, the getter and setter section
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
