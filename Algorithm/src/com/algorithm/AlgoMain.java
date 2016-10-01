package com.algorithm;

public class AlgoMain {

	public static void main(String[] args) {
		
//		int input;
//		input = 10;
//		
//		
//		SumMethod output = new SumMethod(); 		
//		System.out.println("결과 = "+output.sum(input));
//		
//		
//		double[] randomOutput = new double [input];
//		System.out.println("무작위 숫자 "+input+"개 : ");
//		for(double k : randomOutput){
//			System.out.println(k);
		
		int result = numberCount(100, 4);
		System.out.println(result);
		
		String s = "나는 지금 남아서 스터디를 하고 있습니다";
		String splitted[] = s.split(" ");
		System.out.println(splitted[0]);
		
		
		}
	
	public static int numberCount(int max, int target){
		
		int count = 0;
		int count_all = 0;
		char new_target = String.valueOf(target).charAt(0);
		String nums[] = new String[max];
		
		//1부터 max까지의 숫자를 String type으로 nums[i]에 저장합니다
		//num_length[i-1]에 각 숫자의 length를 저장합니다
		//count_all에 모든 숫자의 자리수를 저장합니다
		for(int i=1;i<=max;i++){
			nums[i-1] = String.valueOf(i);
			count_all += nums[i-1].length();
			
		}
		
		//nums_splitted에 모든 숫자를 split해서 저장합니다
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
//			strnum = String.valueOf(i); //숫자를 String type으로 변형
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

	
	
	
	
	// 1. 함수의 이름은 sum()
	// 2. 1개의 int형 숫자를 입력으로 받는다
	// 3. 1부터 입력받은 숫자값까지 더해서 리턴해준다
	// 4. main 함수에서 해당 함수를 호출하여 결과값을 출력한다
	

}






