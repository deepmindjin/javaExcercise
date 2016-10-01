package com;

import com.test.StringTest;

public class StringMain {

	public static void main(String[] args) {
		
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ȳ��ϼ���1 �ȳ��ϼ���2 �ȳ��ϼ���3";
		
		// 1. ����� Ŭ������ �ʱ�ȭ
		StringTest test = new StringTest();
		
		// 2. ����� Ŭ������ ���� �ڿ�(API,method, �Լ�, ����, �����Լ�) �� ȣ��
		String result = test.merge(str1, str2);
		
		System.out.println(result);
		
		
		//���ڿ�����
		System.out.println(result.length());
		//���ڿ��ڸ���(x,y) (x)��°���� (y)��° ����
		System.out.println(result.substring(2,3));
		//���� �˻��Ϸ��� ���ڿ�('��')�� ��ġ - ������ -1
		System.out.println(result.indexOf('��'));
		//2���� �̻��� ���ڿ��� ã�Ƽ� �ִ��� �������� ���´�(Boolean�� return��)
		System.out.println(result.contains("�ϼ�"));
		//���ڿ��� �ٲٰ� ���� ��(x,y) x�� y�� (����)
		System.out.println(result.replace('��','��'));
		//���ڿ��� �� ���� �ϳ��� �ٲٰ� ���� �� 
		System.out.println(result.replaceFirst("�ȳ�", "���"));
		//���ڿ��� �и����ִ°� - ��ģ���� �ٷ� �ϸ� �ȵȰ� �� �޾ƾߵ�
		String splitted[] = result.split(" ");
		int array_count = splitted.length;
		for(int i=0;i<array_count;i++){
		System.out.println(splitted[i]);
		}
		//���� for��
		//for(�迭�� type ������(������s): ������(splitted))
		//�ݺ����� ���鼭 ������ ������ �ִ� String���� �ϳ��� ������ Ȱ���� �Ѵ�
		//�̰� collect��� ��ü�� array���� ��밡�� 
		for(String s : splitted){
			System.out.println(s);
		}
	}

}
