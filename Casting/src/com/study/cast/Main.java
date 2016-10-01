package com.study.cast;

public class Main {//자바는 기본적으로 extends Object가 자동으로 들어간다.
		
	public static void main(String[] args) {
		//어떤 class던지 사용하려면 메모리에 올려야되는데 그 명령어가 new라는 것이다.
		//타입(class이름=객체이름) 식별자 = new 객체이름(); 이게 문법임
		//int a = 10; 과 같이 new를 안 넣어도 되는 이유는 compiler가 이미 얼마나의 메모리를 집어넣어야 
		//되는지 알고 있어서 그렇다. 하지만 우리가 만든 class는 많은 변수를 포함 할 수 있기 때문에 new라고 지정해줘야함
		
//		Casting cast = new Casting();
//		//내가 Casting class를 쓸 준비가 되었다!, 지금 cast에 담아둔 상황
//		
//		cast.setCharToNumber();
	
		Casting.setCharToNumber();
		
		Casting cast = new Casting();
		cast.changeNumberToString(50);
		
		
		
		
		
	}

}
