package com.person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person(180,75,"ȫ��","��");
		person.first_name = "�浿";
		person.setFirstName("ȫ��");
		person.print();
		System.out.println(person.full_name);
	}
}
