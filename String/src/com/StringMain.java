package com;

import com.test.StringTest;

public class StringMain {

	public static void main(String[] args) {
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요1 안녕하세요2 안녕하세요3";
		
		// 1. 사용할 클래스를 초기화
		StringTest test = new StringTest();
		
		// 2. 사용할 클래스를 통해 자원(API,method, 함수, 엠버, 엠버함수) 을 호출
		String result = test.merge(str1, str2);
		
		System.out.println(result);
		
		
		//문자열길이
		System.out.println(result.length());
		//문자열자르기(x,y) (x)번째부터 (y)번째 까지
		System.out.println(result.substring(2,3));
		//내가 검색하려는 문자열('하')의 위치 - 없으면 -1
		System.out.println(result.indexOf('하'));
		//2글자 이상의 문자열을 찾아서 있는지 없는지만 나온다(Boolean이 return값)
		System.out.println(result.contains("하세"));
		//문자열을 바꾸고 싶을 때(x,y) x를 y로 (전부)
		System.out.println(result.replace('요','용'));
		//문자열을 맨 앞의 하나만 바꾸고 싶을 때 
		System.out.println(result.replaceFirst("안녕", "노노"));
		//문자열을 분리해주는것 - 이친구는 바로 하면 안된고 뭘 받아야됨
		String splitted[] = result.split(" ");
		int array_count = splitted.length;
		for(int i=0;i<array_count;i++){
		System.out.println(splitted[i]);
		}
		//향상된 for문
		//for(배열의 type 변수명(임의의s): 변수명(splitted))
		//반복문을 돌면서 오른쪽 변수에 있던 String들을 하나씩 꺼내서 활동을 한다
		//이건 collect라는 객체랑 array에서 사용가능 
		for(String s : splitted){
			System.out.println(s);
		}
	}

}
