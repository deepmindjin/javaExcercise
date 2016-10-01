package com.study.academy;

import java.util.ArrayList;

public class Academy {
	
	private String academyCode;
	private String name;
	// 카테고리에 하위 카테고리가 있으면 거의 하위 속성이 들어간다
	
	// 객체를 집어넣기 위해서, 배열의 크기가 얼마나 될 지 모를 때 Collection을 사용한다
	// 아래의 ArrayList는 Collection중 하나
	
	private ArrayList<ClassRoom> rooms = new ArrayList<ClassRoom>();
	
	public Academy(){
		

		
	}
	
	public void addClassRoom(ClassRoom classroom){
		rooms.add(classroom);
		
	}
	
	public void addStudent(Student std){
		if(std.)
	}
	
	public void showRoomList(){
		for(ClassRoom room : rooms){
			System.out.println(room.getName());
			room.showStudents();
		}
	}
	
	// 교실에 학생을 배정해주는 역할을 해야한다
	public void setStudent(ClassRoom classroom, Student student){
		
	}

	public String getAcademyCode() {
		return academyCode;
	}

	public void setAcademyCode(String academyCode) {
		this.academyCode = academyCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
