package com.study.cast;

public class Casting {
	//Casting�̶� ���¸� ��ȯ�� �ִ� �� 
	//�Լ����� get�� set�� ���� ���δ�.
	
	//���ڸ� -> ���ڷ�
	public static void setCharToNumber(){
		//static�� ���� ������ new�� ���� �ʾƵ� VM���� �ڵ����� �޸𸮸� �������ش�
		//����, �Լ� �տ� static�� ��������� �� new�� �������ص���
		String a = "256";
		
		int b = Integer.parseInt(a);
		
		byte c = Byte.parseByte(a);
		//int  - Integer
		//byte - Byte
		//long - Long
		//char - Char
		//double - Double
		//float - Float
		
		//a�� ���� ���ڷ� �ٲ���
		
		
		System.out.println(b+100);
		
	}
	
	
	//���ڸ� -> ���ڷ�
	public void changeNumberToString(){
		int num = 256;
		int num2 = 256;
		
		
		String str = String.valueOf(num);
		
		String str2 = num + "";
		//�� ����� �����ڵ��� �� ���� ����
		
		System.out.println(str1,str2);
	}
	
	
	
	
	
	
}
