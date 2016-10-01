package com.montyhall;

public class MontyHallMain {

	public static void main(String[] args) {

		int countChange = 0;
		int countNonChange = 0;
		int car = 0;
		int choice = 0;
		GetRandom getrandom = new GetRandom();

		for (int i = 0; i < 1000; i++) {
			car = getrandom.randomChoice();
			choice = getrandom.randomChoice();

			// When we did not change the first choice
			if(choice == )
			// When we change our choice
		}

		System.out.println("바꾸지 않을 때의 성공 횟수는 " + countNonChange + "입니다");
		System.out.println("바꾸었을 때의 성공 횟수는 " + countChange + "입니다");
	}

}
