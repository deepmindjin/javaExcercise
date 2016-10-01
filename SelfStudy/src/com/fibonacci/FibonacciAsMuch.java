package com.fibonacci;

public class FibonacciAsMuch {
	public void fiboAsMuch(int input){
		int first = 0;
		int second = 1;
		int front, back,sum;
		front = first;
		back = second;

		for(int i=0;i<input;i++){
			System.out.println(front);
			sum = front + back;
			front = back;
			back = sum;
		}
	}
}
