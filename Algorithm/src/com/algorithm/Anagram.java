package com.algorithm;

import java.util.ArrayList;

// 두 개의 문자열 인풋을 받아서
// 두 개의 문자열에 포함된 문자의 숫자가 같은지를 비교해서
// 같으면 true 다르면 false 리턴하는 함수를 작성하세요


public class Anagram {
	String a;
	String b;
	ArrayList<Character> checkList = new ArrayList<>();
	public Anagram(String a, String b){
		this.a = a.toUpperCase();
		this.b = b.toUpperCase();
	}
	
	public boolean checkAnagram(){
		boolean result = true;
		
		// 사이즈 비교
		if(a.length()!=b.length()){
			result = false;
			return result;
		}
		
		// 첫 번째 문자열의 char를 다 ArrayList에 집어 넣는다
		for(int i=0;i<a.length();i++){
			char alphabet = a.charAt(i);
			checkList.add(alphabet);
		}
		
		// 두 번째 문자열의 char를 ArrayList에서 뺀다
		// 만약 그 문자열이 없다면 false를 return
		for(int i=0;i<b.length();i++){
			char alphabet = b.charAt(i);
			if(checkList.contains(alphabet)){
				checkList.remove(checkList.indexOf(alphabet));
			}else{
				result = false;
				break;
			}
		}
	
		return result;
	}
}
