package com.numberbaseball;

import java.util.Scanner;

public class numberBaseballMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int chance = 0;
		int answerArray[] = { 6, 7, 8, 9 };
		String input;
		int numList[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int inputPosition = 0;
		int answerPosition = 0;
		int ball = 0;
		int strike = 0;
		int numValCount = 0;
		int[] inputNum = new int[4];

		System.out.println("--- 숫자야구를 시작합니다 ---");
		chance = 10;
		whole: while (true) {
			if (chance == 0) {
				System.out.println("기회를 모두 사용하셨습니다");
				System.out.println("끝!");
				break;
			}
			numValidation: while (true) {
				numValCount = 0;
				System.out.println("4자리 숫자를 입력해주세요");
				input = scan.nextLine();

				if (input.length() != 4) {
					continue numValidation;
				}

				for (int i = 0; i < 4; i++) {
					inputNum[i] = (int) (input.charAt(i) - '0');
					for (int j = 0; j < numList.length; j++) {
						numValCount++;
						break;
					}
				}

				if (numValCount != 4) {
					System.out.println("숫자만 입력해주세요");
				} else {
					break numValidation;
				}
			}

			chance--;

			for (int j = 0; j < 4; j++) {
				answerPosition = j;
				for (int p = 0; p < 4; p++) {
					inputPosition = p;
					if (inputNum[p] == answerArray[j]) {
						if (inputPosition == answerPosition) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}

			System.out.println(strike + "스트라이크 " + ball + "볼 입니다");

			if (strike == 4) {
				System.out.println("정답입니다!");
				break whole;
			}
			ball = 0;
			strike = 0;
			System.out.println("남은 기회는" + chance + "번 입니다\n");

		}
	}
}
