package com.study.academy;

import java.util.ArrayList;

public class Academy {
	
	private String academyCode;
	private String name;
	// ī�װ��� ���� ī�װ��� ������ ���� ���� �Ӽ��� ����
	
	// ��ü�� ����ֱ� ���ؼ�, �迭�� ũ�Ⱑ �󸶳� �� �� �� �� Collection�� ����Ѵ�
	// �Ʒ��� ArrayList�� Collection�� �ϳ�
	
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
	
	// ���ǿ� �л��� �������ִ� ������ �ؾ��Ѵ�
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
