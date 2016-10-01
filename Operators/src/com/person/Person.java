package com.person;

public class Person {
	// Ŭ���� �ؿ� �ٷ� ���ִ� �������� ��� ������� �Ѵ�
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
	
	
	// �����ڴ� return type�� ����
	// �����ڿ��� �ʱ�ȭ�� �� �ش�
	// �����ڿ��� ������ �ʱ�ȭ ���ִ� ������ �Լ� �ٱ������� ������ �ϸ� �ȵǱ� �����̴�
	public Person(int height, int weight, String first_name, String last_name){
		this.height = height;
		this.weight = weight;
		this.first_name = first_name;
		this.last_name = last_name;
		full_name = first_name + last_name;
		
	}
	
	// Ŭ���� �ؿ� �ִ� �Լ��� ��� �Լ���� �Ѵ�
	// ������ �ϴ� ������ Ŭ������ ȣ�� �ϸ� ������ �����ϱ� �����̴�
	public void setFirstName(String str){
		
		int temp = 0;
		// �̰� ����������� �Ѵ�
		// class�� �����ص� �̾� �� �� ����
		first_name = str;
	}
	
	public void print(){
		System.out.println("height = "+height);
		System.out.println("weight = "+weight);
		System.out.println("first_name = "+first_name);
		System.out.println("last_name = "+last_name);
	}
}
