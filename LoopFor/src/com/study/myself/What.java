package com.study.myself;

public class What {
	public static int getRandom(){
		double rand;
		int result;
		
		//return random number between 1~100
		rand = Math.random();
		result = (int) (rand*100);
		return result;	
	}
	
	public static String getRandomString(){
		String str = "����!";
		
		for(int i=0;i<100;i++){
			str = str + String.valueOf(i) +"��°";
		}
		return str;
	}
	
	public static 
}
