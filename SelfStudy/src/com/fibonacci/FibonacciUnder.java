package com.fibonacci;

public class FibonacciUnder {
	public static void fiboUnder(int input){
		// input�� ������ �޾Ƽ�
		// input ���ϱ����� �Ǻ���ġ ������ ����ϴ� ���α׷�
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
