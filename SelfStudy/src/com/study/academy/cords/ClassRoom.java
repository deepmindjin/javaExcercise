package com.study.academy.cords;

import java.util.ArrayList;

public class ClassRoom {
	// Attributes of ClassRoom
	private String subject;
	private int size;
	private String roomCode;
	private ArrayList<Student> people = new ArrayList<>();
	
	// There are 2 constructors for this class
	// First constructor is vanilla one
	public ClassRoom(){
		subject = "";
		size = 0;
		roomCode = "";
	}
	
	// Second constuctor needs subject, size, roomcode in order
	public ClassRoom(String subject, int size, String roomCode){
		this.subject = subject;
		this.size = size;
		this.roomCode = roomCode;
	}
	
	// Print the name of everyone taking this course
	public void showRoom(){
		System.out.println(getSubject());
		for(Student s : people){
			System.out.println("-"+s.getName());
		}
		System.out.println("");
	}
	
	// add student to this course
	public void addStduentToRoom(Student std){
		people.add(std);
		std.setSubject(subject);
	}

	
	// From this line, the getter and setter section
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public ArrayList<Student> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Student> people) {
		this.people = people;
	}
	
	
}
