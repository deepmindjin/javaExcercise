package com.study.controlflow;

public class controlIf {
	final int OVER20 = 21;
	final int SAME20 = 20;
	final int UNDER20 = 19;
	
	public void compareNumbers(int a,int b){
		//()�ȿ� ���� ���� parameter��� �Ѵ�
		//�Լ��� type�� ���̴� ���� �����ϱ� ���� parameter�� ������ �� type�� �������ش�
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		if(a==b){//if���� �帧 ��� ���ؼ� �Ѵ�
			System.out.println("a�� b�� �����ϴ�");
		} else if(a>b){
			System.out.println("a�� b���� Ů�ϴ�");
		} else{
			System.out.println("a�� b���� �۽��ϴ�");
		}
		
		
		
		
	}
	
	public void compareNumbersBySwitch(int a){//�Լ����� ��ĥ �� ������ ���� �Լ��� scope�� �޶� ��밡��

	
		//switch���� ���� ���ڸ� 1�� �޾Ƽ� �װ��� ���� ���ؼ� �б⸦ ������
		//switch���� ���� Ư���Ǿ��� �� ���
		switch(a){
		case OVER20:
			System.out.println("20���� Ů�ϴ�");
			break; //break���� ���� ������ ������ �� ��������
		case SAME20:
			System.out.println("20�� �����ϴ�");
			break;
		case UNDER20:
			System.out.println("20���� �۽��ϴ�");
			break;
		}
	}
	

}
