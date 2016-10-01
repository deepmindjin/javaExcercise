package com.study.academy.cords;

import java.util.ArrayList;

import com.study.academy.cords.ClassRoom;

public class Academy {
	private String name;
	private String academyCode;
	private ArrayList<ClassRoom> rooms = new ArrayList<>();
	private ArrayList<Student> allStudents = new ArrayList<>();
	
	// Constuctor for Academy
	public Academy(String name, String academyCode){
		this.name = name;
		this.academyCode = academyCode;
	}
	
	// Show all the people enrolled in academy
	public void showPeople(){
		System.out.println("이 학원에 다니는 학생은");
		
//		for(ClassRoom room : rooms){
//			for(Student std : room){
//				System.out.println(std.getName());
//			}
//		}
		
		for(Student s : allStudents){
			System.out.println("-"+s.getName());
		}
		
		System.out.println("입니다");
	}
	
	// Add a student to specific classroom
	public void addStudentToRoom(Student std, ClassRoom room){
		allStudents.add(std);
		room.addStduentToRoom(std);
	}
	
	// From this line, all the getter and setter section
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcademyCode() {
		return academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	
	public ArrayList<ClassRoom> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<ClassRoom> rooms) {
		this.rooms = rooms;
	}

	public ArrayList<Student> getAllStudents() {
		return allStudents;
	}

	public void setAllStudents(ArrayList<Student> allStudents) {
		this.allStudents = allStudents;
	}
	
	
}
