package com.person;

public class Person {
	// 클래스 밑에 바로 써주는 변수들을 멤버 변수라고 한다
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	private int weight;
	private String first_name;
	private String last_name;
	private String full_name;
	
	
	// 생성자는 return type이 없다
	// 생성자에서 초기화를 해 준다
	// 생성자에서 변수를 초기화 해주는 이유는 함수 바깥에서는 연산을 하면 안되기 때문이다
	public Person(int height, int weight, String first_name, String last_name){
		this.height = height;
		this.weight = weight;
		this.first_name = first_name;
		this.last_name = last_name;
		full_name = first_name + last_name;
		
	}
	
	// 클래스 밑에 있는 함수를 멤버 함수라고 한다
	// 멤버라고 하는 이유는 클래스를 호출 하면 접근이 가능하기 때문이다
	public void setFirstName(String str){
		
		int temp = 0;
		// 이건 지역변수라고 한다
		// class에 접근해도 뽑아 낼 수 없다
		first_name = str;
	}
	
	public void print(){
		System.out.println("height = "+height);
		System.out.println("weight = "+weight);
		System.out.println("first_name = "+first_name);
		System.out.println("last_name = "+last_name);
	}
}
