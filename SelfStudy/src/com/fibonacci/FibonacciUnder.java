package com.fibonacci;

public class FibonacciUnder {
	public static void fiboUnder(int input){
		// input을 정수로 받아서
		// input 이하까지의 피보나치 수열을 출력하는 프로그램
		int first = 0; // First element of fibo
		int second = 1; // Second element of fibo
		int front, back,sum;
		front = first;
		back = second;
		
		while(true){
			System.out.println(front);
			if(back>=input){
				break;
			}
			sum = front + back; // next fibo number is the sum of 2 numbers ahead
			front = back; 
			back = sum;
		}
	}
}
