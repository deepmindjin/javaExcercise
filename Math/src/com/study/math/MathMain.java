package com.study.math;

import java.util.Random;

public class MathMain {

	
					//��ȯ ���� ���� ��� void
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
		//while���� 
		
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
		
		// �迭�� ���� �Է��ϱ� ���� �ݺ���
		
		for(int i=0;i<6;i++){
			a[i] = ran.getRandomNumber();
			for(int j=0;j<i;j++){
				if(a[i] == a[j]){
					i--;
					break;
					//break�� ���� ������ ���� ���� ã�Ƶ� ������ �ʱ� ������ ���� �ɸ���
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
		
		
		// �迭�� ���� ����ϱ� ���� �ݺ���
		for(int k=0;k<6;k++){
			System.out.print(a[k] + " ");
		}
		System.out.print("���ʽ� ���� : "+b);
	}

	
	public double randomUnder45(){
		Ran ran = new Ran();
		double temp = ran.getRandomByMath();
		
		temp = Math.ceil(temp*45);
		return temp;
	}
	
	
	
	
	
}
