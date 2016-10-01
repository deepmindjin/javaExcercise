package com.study.math;

import java.util.Random;

public class Ran {
	
	public int getRandomNumber(){
		//최상단에 자신이 return할 값을 설정 해 주는 것이 좋다.
		int result;
		
		Random random = new Random();
		result = random.nextInt(45) + 1;
		return result;
	}
	
	public double getRandomByMath(){
		return Math.random();
		
		//double temp = Math.random();
	}
}
