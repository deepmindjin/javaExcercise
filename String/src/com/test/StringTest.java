package com.test;


public class StringTest {
	
	public String merge(String str1, String str2){
		
		//1. +����
		// str1 + str2 = �ӵ��� ������ �޸𸮸� �����Ѵ�
		// jdk 1.7���� �Ϲ����� ��Ʈ�������� Ŀ���Ϸ���
		// ��Ʈ������ ���·� ó���� ���ݴϴ�
		
		// StringBuffer
		// ��Ƽ������ ȯ�濡�� �������Դϴ�
		
		// StringBuilder
		// ��Ƽ������ ȯ�濡�� ������ ������� �� �����ϴ�
		
		// �ȵ���̵� ȯ�濡���� StringBuiler�� ���� �ȴ�.

		
//		StringBuffer sb = new StringBuffer();
//		
//		sb.append(str1);
//		sb.append(str2);
//		
//		return str1+str2;
		
		//�̰� �� ������!!!
		StringBuilder sbl = new StringBuilder();
		sbl.append(str1);
		sbl.append(str2);
		
		return sbl.toString();
	}
	 
	
	 
}
