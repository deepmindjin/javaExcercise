package com.study.academy;

import java.util.ArrayList;

public class ClassRoom {
		
	private String roomCode;
	private String name;
	private int size;
	private ArrayList<Student> students = new ArrayList<>();
	
	public ClassRoom(){
		
		
		
		if(classroom.getName() == "안드로이드"){
			Student student1 = new Student("백향목");
//			student1.setName("백향목");
			
			Student student2 = new Student("최재형");
//			student2.setName("최재형");
			
			Student student3 = new Student("안준혁");
//			student3.setName("안준혁");
			
			students.add(student3);
			students.add(student2);
			students.add(student1);
		
		}else if(classroom.getName() == "프론트엔드"){
			Student student1 = new Student("이순신");
//			student1.setName("이순신");
			
			Student student2 = new Student("세종대왕");
//			student2.setName("세종대왕");
			
			Student student3 = new Student("정조");
//			student3.setName("정조");
			
			students.add(student3);
			students.add(student2);
			students.add(student1);
			
		}else if(classroom.getName() == "영어회화"){
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
