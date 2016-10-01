package com.sort.bucket;

public class createRandom {
	public static int[] getNum(int size) {
		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			result[i] = (int) (Math.random() * size);
		}

		return result;
	}
}
