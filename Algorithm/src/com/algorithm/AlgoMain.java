package com.algorithm;

public class AlgoMain {

	public static void main(String[] args) {
		
//		int input;
//		input = 10;
//		
//		
//		SumMethod output = new SumMethod(); 		
//		System.out.println("��� = "+output.sum(input));
//		
//		
//		double[] randomOutput = new double [input];
//		System.out.println("������ ���� "+input+"�� : ");
//		for(double k : randomOutput){
//			System.out.println(k);
		
		int result = numberCount(100, 4);
		System.out.println(result);
		
		String s = "���� ���� ���Ƽ� ���͵� �ϰ� �ֽ��ϴ�";
		String splitted[] = s.split(" ");
		System.out.println(splitted[0]);
		
		
		}
	
	public static int numberCount(int max, int target){
		
		int count = 0;
		int count_all = 0;
		char new_target = String.valueOf(target).charAt(0);
		String nums[] = new String[max];
		
		//1���� max������ ���ڸ� String type���� nums[i]�� �����մϴ�
		//num_length[i-1]�� �� ������ length�� �����մϴ�
		//count_all�� ��� ������ �ڸ����� �����մϴ�
		for(int i=1;i<=max;i++){
			nums[i-1] = String.valueOf(i);
			count_all += nums[i-1].length();
			
		}
		
		//nums_splitted�� ��� ���ڸ� split�ؼ� �����մϴ�
		char nums_splitted[] = new char[count_all];
		int array_length = 0;
		int array_count = 0;
		
		for(int j=0;j<max;j++){
			array_length = nums[j].length();
			for(int k=0;k<array_length;k++){
				nums_splitted[array_count] = nums[j].charAt(k);
				array_count++;
			}
		}
		
		//compare all the splitted numbers and target number and count that
		for(int l=0;l<array_count;l++){
			if(nums_splitted[l] == new_target){
				count++;
			}
		}
		
		return count;
	}
	
	
//	public static int numberCount(int max, int target){
//		int count = 0;
//		String s_target = String.valueOf(target);
//		
//		StringBuilder nums = new StringBuilder();
//		String strnum;
//		String numbers[] = new String[(max*(max+1)/2)];
//		
//		for(int i=0;i<=max;i++){
//			nums.append(String.valueOf(i));
//		}
//		
//		numbers = nums.split(String.valueOf(target));
//		count = numbers.length; 
//		return count;
	
	
	
	
//	public static int numberCount(int max, int target){
//		int count = 0;
//		int numberBefore = 0;
//		int numberAfter = 0;
//		String strTarget = String.valueOf(target);
//		String strnum;
//		String numbers[] = new String[max];
//		
//		for(int i = 0;i<=max;i++){
//			strnum = String.valueOf(i); //���ڸ� String type���� ����
//			numberBefore += strnum.length();
//			strnum = strnum.replace(strTarget, "  ");
//			numberAfter += strnum.length();
//		}
//		
//		int result = 0;
//		result = numberAfter - numberBefore;
//		count  = result;
//	
//		return count;
//	}

	
	
	
	
	// 1. �Լ��� �̸��� sum()
	// 2. 1���� int�� ���ڸ� �Է����� �޴´�
	// 3. 1���� �Է¹��� ���ڰ����� ���ؼ� �������ش�
	// 4. main �Լ����� �ش� �Լ��� ȣ���Ͽ� ������� ����Ѵ�
	

}





