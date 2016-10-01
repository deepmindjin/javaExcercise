package parents.children;

import parents.Father;

public class Child extends Father{
	String book;
	int time;
	String PC;
	String lol_account;
	int game_money;
	String girlfriend = "캘리브룩";
			
	void play(){
		System.out.println("�Ƶ��� �������̴�");
	}	
	
	@Override
	public void drive(){
		System.out.println("���� "+car+" �̾Ҵ�");
	}
	
	public void meetFatherGirl(){
		System.out.println("���� ���� �ƺ��� ����ģ�� "+super.girlfriend+"�� ������");
	}
	
	public void meet(){
		System.out.println("���� ���� ����ģ�� "+girlfriend+"�� ������");
	}
	
}
