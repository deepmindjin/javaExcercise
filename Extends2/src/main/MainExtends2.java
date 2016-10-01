package main;

import city.City;
import city.Seoul;
import city.gu.Gangnam;

public class MainExtends2 {

	public static void main(String[] args) {
		
		// 인터페이스의 제한을 위해서 가장 최고위에 있는 상속자를 먹는다
		City seoul = new Seoul();
		City gangnam = new Gangnam();
		
		seoul.collectTax(1000);
		gangnam.collectTax(1000);
		
	}

}
