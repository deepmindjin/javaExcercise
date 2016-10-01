package com.hongseokjang;

public class Sumloop {

	public static void main(String[] args) {
		double sum = 0;
		double end = 999999999;
		
		for(double i=1;i<=end;i++){
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}
