package com.algorithm;

import java.util.Random;

public class SumMethod {
	
	public int sum(int end){
//		int result=0;
//		
//		for(int i=1;i<=end;i++){
//			result += i;
//		}
		int result = end*(end+1)/2;
		//잊지말자!!!!!!!!!!!
		return result;
	}
	
	public int[] randomNumber(int num){
		int array[] = new int[num];
		
		for(int i=0;i<num;i++){
			array[i] = Math.random();
		}
		return array;
	}
	
	// 1부터 10,000 까지 숫자 8이 총 몇번 나오는지 카운팅 하세요
	// 8이 포함되어 있는 모든 숫자의 객수를 카운팅 하는것이 x
	// 예를 들어 숫자 8,088이면 카운팅이 1이 아니라 3이 되는 것
	// String을 꼭 쓰자
	
	public static int numberCount(int max, int target){
		int count = 0;
		int howmany = 0;
		
		String nums[] = new String[max];
		for(int i=0;i<max;i++){
			nums[i] = i+"";
			howmany += nums[i].length();
		}
		
	
		char nums_splitted[] = new char[howmany];
		int array_length = 0;
		int array_count = 0;
		
		for(int j=0;j<max;j++){
			array_length = nums[j].length();
			for(int k=0;k<array_length;k++)
				nums_splitted[array_count] = nums[j].charAt(k);
				array_count++;
		}
		
		for(int l=0;l<array_count;l++){
			if(nums_splitted[l] == (char)target){
				count++;
			}
		}
			
		return count;
	}
}

// 1. 함수의 이름은 sum()
// 2. 1개의 int형 숫자를 입력으로 받는다
// 3. 1부터 입력받은 숫자값까지 더해서 리턴해준다
// 4. main 함수에서 해당 함수를 호출하여 결과값을 출력한다