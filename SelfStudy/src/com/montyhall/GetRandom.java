package com.montyhall;

public class GetRandom {

	public static int randomChoice() {
		int result = 0;

		int choice = 0;
		choice = (int) (Math.random() * 3);
		result = choice;

		return result;
	}
}
