package com.study.math;

import java.util.Random;

public class Ran {
	
	public int getRandomNumber(){
		//�ֻ�ܿ� �ڽ��� return�� ���� ���� �� �ִ� ���� ����.
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
