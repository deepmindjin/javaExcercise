package com.study.cast;

public class Main {//�ڹٴ� �⺻������ extends Object�� �ڵ����� ����.
		
	public static void main(String[] args) {
		//� class���� ����Ϸ��� �޸𸮿� �÷��ߵǴµ� �� ��ɾ new��� ���̴�.
		//Ÿ��(class�̸�=��ü�̸�) �ĺ��� = new ��ü�̸�(); �̰� ������
		//int a = 10; �� ���� new�� �� �־ �Ǵ� ������ compiler�� �̹� �󸶳��� �޸𸮸� ����־�� 
		//�Ǵ��� �˰� �־ �׷���. ������ �츮�� ���� class�� ���� ������ ���� �� �� �ֱ� ������ new��� �����������
		
//		Casting cast = new Casting();
//		//���� Casting class�� �� �غ� �Ǿ���!, ���� cast�� ��Ƶ� ��Ȳ
//		
//		cast.setCharToNumber();
	
		Casting.setCharToNumber();
		
		Casting cast = new Casting();
		cast.changeNumberToString(50);
		
		
		
		
		
	}

}
