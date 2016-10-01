package com.study.controlflow;

public class controlIf {
	final int OVER20 = 21;
	final int SAME20 = 20;
	final int UNDER20 = 19;
	
	public void compareNumbers(int a,int b){
		//()안에 들어가는 것을 parameter라고 한다
		//함수의 type이 꼬이는 것을 방지하기 위해 parameter를 선언할 때 type을 설정해준다
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		if(a==b){//if문은 흐름 제어를 위해서 한다
			System.out.println("a와 b가 같습니다");
		} else if(a>b){
			System.out.println("a가 b보다 큽니다");
		} else{
			System.out.println("a가 b보다 작습니다");
		}
		
		
		
		
	}
	
	public void compareNumbersBySwitch(int a){//함수명은 겹칠 수 없지만 위의 함수와 scope가 달라서 사용가능

	
		//switch문은 보통 인자를 1개 받아서 그것의 값을 통해서 분기를 나눈다
		//switch문은 값이 특정되었을 때 사용
		switch(a){
		case OVER20:
			System.out.println("20보다 큽니다");
			break; //break문을 달지 않으면 밑으로 다 내려간다
		case SAME20:
			System.out.println("20과 같습니다");
			break;
		case UNDER20:
			System.out.println("20보다 작습니다");
			break;
		}
	}
	

}
