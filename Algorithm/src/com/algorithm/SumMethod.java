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
		//��������!!!!!!!!!!!
		return result;
	}
	
	public int[] randomNumber(int num){
		int array[] = new int[num];
		
		for(int i=0;i<num;i++){
			array[i] = Math.random();
		}
		return array;
	}
	
	// 1���� 10,000 ���� ���� 8�� �� ��� �������� ī���� �ϼ���
	// 8�� ���ԵǾ� �ִ� ��� ������ ������ ī���� �ϴ°��� x
	// ���� ��� ���� 8,088�̸� ī������ 1�� �ƴ϶� 3�� �Ǵ� ��
	// String�� �� ����
	
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

// 1. �Լ��� �̸��� sum()
// 2. 1���� int�� ���ڸ� �Է����� �޴´�
// 3. 1���� �Է¹��� ���ڰ����� ���ؼ� �������ش�
// 4. main �Լ����� �ش� �Լ��� ȣ���Ͽ� ������� ����Ѵ�