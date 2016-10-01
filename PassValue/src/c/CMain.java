package c;

import d.DMain;

public class CMain {

	// 빼기 4를 하는 함수
//	public int minusFour(int input){
//		int result;
//		
//		result = input - 4;
//		
//		return result;
//	}
	public void minus(int n){
		int result = n-4;
		
		DMain main = new DMain();
		main.multiThree(result);
	}
}
