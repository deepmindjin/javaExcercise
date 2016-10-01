package com.study.self;

public class Main {

	public static void main(String[] args) {
		int ten = ForOtherClass.GetNumber();
		
		ForOtherClass s = new ForOtherClass();
		String k = s.GetString();
		
		System.out.println(ten);
		System.out.println(k);
	}

}
