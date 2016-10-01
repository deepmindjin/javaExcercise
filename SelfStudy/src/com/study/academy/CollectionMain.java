package com.study.academy;

import com.study.academy.cords.*;

public class CollectionMain {

	public static void main(String[] args) {
		
		// Add the academy
		Academy academy = new Academy("Fast Campus","ACA001");
		
		// Add the classes
		ClassRoom class1 = new ClassRoom("안드로이드",50,"CLS001");
		ClassRoom class2 = new ClassRoom("프론트엔드",100,"CLS002");
		ClassRoom class3 = new ClassRoom("영어회화",10,"CLS003");	
		
		// Add the students
		Student std1 = new Student("케로로");
		Student std2 = new Student("기로로");
		Student std3 = new Student("뽀로로");
		Student std4 = new Student("Jason");
		Student std5 = new Student("Alex");
		Student std6 = new Student("Paul");
		Student std7 = new Student("김개똥");
		Student std8 = new Student("홍길동");
		Student std9 = new Student("박칠칠");
		Student std10 = new Student("안드로보이");
		
		// Assign 3 people to 안드로이드
		academy.addStudentToRoom(std1, class1);
		academy.addStudentToRoom(std2, class1);
		academy.addStudentToRoom(std3, class1);
		academy.addStudentToRoom(std10, class1);
		
		// Assign 3 people to 프론트엔드
		academy.addStudentToRoom(std7, class2);
		academy.addStudentToRoom(std8, class2);
		academy.addStudentToRoom(std9, class2);
		
		// Assign 3 people to 영어회화
		academy.addStudentToRoom(std4, class3);
		academy.addStudentToRoom(std5, class3);
		academy.addStudentToRoom(std6, class3);
		
		// Show every people who take the same course
		class1.showRoom();
		class2.showRoom();
		class3.showRoom();
		
		// Show every people in the academy
		academy.showPeople();
		
		// Check out whether he is taking this course
		std1.inClassOrNot(class1);
		std1.inClassOrNot(class2);
		std1.inClassOrNot("안드로이드");
	}

}
