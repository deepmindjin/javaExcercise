package com.test;


public class StringTest {
	
	public String merge(String str1, String str2){
		
		//1. +연산
		// str1 + str2 = 속도가 느리고 메모리를 차지한다
		// jdk 1.7부터 일반적인 스트링연산은 커파일러가
		// 스트링빌더 형태로 처리를 해줍니다
		
		// StringBuffer
		// 멀티스레드 환경에서 안정적입니다
		
		// StringBuilder
		// 멀티스레드 환경에서 동작을 보장받을 수 없습니다
		
		// 안드로이드 환경에서는 StringBuiler를 쓰면 된다.

		
//		StringBuffer sb = new StringBuffer();
//		
//		sb.append(str1);
//		sb.append(str2);
//		
//		return str1+str2;
		
		//이게 더 빠르다!!!
		StringBuilder sbl = new StringBuilder();
		sbl.append(str1);
		sbl.append(str2);
		
		return sbl.toString();
	}
	 
	
	 
}
