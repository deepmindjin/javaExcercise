package com.sort;

public class GetRandom {
	public static int[] getRandom(int num){
		int result[] = new int[num];
		
		for(int i=0;i<num;i++){
		result[i] = (int)(Math.random()*100);
		}
		
		return result; 
	}
}
