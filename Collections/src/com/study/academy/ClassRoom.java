package com.study.academy;

import java.util.ArrayList;

public class ClassRoom {
		
	private String roomCode;
	private String name;
	private int size;
	private ArrayList<Student> students = new ArrayList<>();
	
	public ClassRoom(){
		
		
		
		if(classroom.getName() == "�ȵ���̵�"){
			Student student1 = new Student("�����");
//			student1.setName("�����");
			
			Student student2 = new Student("������");
//			student2.setName("������");
			
			Student student3 = new Student("������");
//			student3.setName("������");
			
			students.add(student3);
			students.add(student2);
			students.add(student1);
		
		}else if(classroom.getName() == "����Ʈ����"){
			Student student1 = new Student("�̼���");
//			student1.setName("�̼���");
			
			Student student2 = new Student("�������");
//			student2.setName("�������");
			
			Student student3 = new Student("����");
//			student3.setName("����");
			
			students.add(student3);
			students.add(student2);
			students.add(student1);
			
		}else if(classroom.getName() == "����ȸȭ"){
			Student student1 = new Student("Jason");
			
			Student student2 = new Student("Andrew");
			
			Student student3 = new Student("Paul");
			
			students.add(student3);
			students.add(student2);
			students.add(student1);
		}

	}
	
	public void showStudents(){
		for(Student s : students){
			System.out.println("-"+s.getName());
		}
	}
	
//	public void addStudent(Student student){
//		students.add(student);
//	}

	public String getRoomCode() {
		return roomCode;
	}


	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
}
