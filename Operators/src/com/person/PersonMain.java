package com.person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person(180,75,"È«¼®","Àå");
		person.first_name = "±æµ¿";
		person.setFirstName("È«¼®");
		person.print();
		System.out.println(person.full_name);
	}
}
