package com.study.math;

import java.util.Random;

public class MathMain {

	
					//반환 값이 없을 경우 void
	public static void main(String[] args) {
		
//		MathMain lotto = new MathMain();
//		lotto.makeLotto();
		
		MathMain main = new MathMain();
		
/*		int num;
		
		num = (int)main.randomUnder45();
		
		System.out.println("random="+num);*/
		
		main.testWhile();

		
		
	}
	
	
	public void testWhile(){
		//while문은 
		
		int i = 0;
		boolean flag = true;
		
		do{
			System.out.print(i++);
			
			if(i>45){
				flag = false;
			}
		}while(flag=true);

	}

	
	public void makeLotto(){
		
		int[] a = new int[6];
		int b = 0;
		
		Ran ran = new Ran();
		
		// 배열에 값을 입력하기 위한 반복문
		
		for(int i=0;i<6;i++){
			a[i] = ran.getRandomNumber();
			for(int j=0;j<i;j++){
				if(a[i] == a[j]){
					i--;
					break;
					//break를 쓰지 않으면 같은 것을 찾아도 나가지 않기 때문에 오래 걸린다
				}
			}
		}
		

		for(int q=0;q<6;q++){
			b = ran.getRandomNumber();
			if(b == a[q]){
				q--;
				break;
			}
		}
		
		
		// 배열의 값을 출력하기 위한 반복문
		for(int k=0;k<6;k++){
			System.out.print(a[k] + " ");
		}
		System.out.print("보너스 숫자 : "+b);
	}

	
	public double randomUnder45(){
		Ran ran = new Ran();
		double temp = ran.getRandomByMath();
		
		temp = Math.ceil(temp*45);
		return temp;
	}
	
	
	
	
	
}
