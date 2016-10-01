package com.study.cast;

public class Casting {
	//Casting이란 형태를 변환해 주는 것 
	//함수명은 get과 set을 많이 붙인다.
	
	//숫자를 -> 문자로
	public static void setCharToNumber(){
		//static을 집어 넣으면 new를 하지 않아도 VM에서 자동으로 메모리를 지정해준다
		//변수, 함수 앞에 static을 집어넣으면 다 new로 지정안해도됨
		String a = "256";
		
		int b = Integer.parseInt(a);
		
		byte c = Byte.parseByte(a);
		//int  - Integer
		//byte - Byte
		//long - Long
		//char - Char
		//double - Double
		//float - Float
		
		//a의 값을 숫자로 바꿔줌
		
		
		System.out.println(b+100);
		
	}
	
	
	//문자를 -> 숫자로
	public void changeNumberToString(){
		int num = 256;
		int num2 = 256;
		
		
		String str = String.valueOf(num);
		
		String str2 = num + "";
		//이 방법을 개발자들이 더 많이 쓴다
		
		System.out.println(str1,str2);
	}
	
	
	
	
	
	
}
