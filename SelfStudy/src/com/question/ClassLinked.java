package com.question;

public class ClassLinked {
	
	public static void main(String[] agrs){
		
	}
}

public class A{
	int num = 0;
	B b = new B();
	
}

public class B{
	int num = 0;
	A a = new A();
}