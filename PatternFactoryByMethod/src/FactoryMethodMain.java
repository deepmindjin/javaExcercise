
public class FactoryMethodMain {

	public static void main(String[] args) {
		Car car1 = CarFactory.newInstance("포르쉐");
		car1.setDestination("Seoul", "Tokyo");
		car1.drive();
		
		Car car2 = CarFactory.newInstance("BMW");
		car2.setDestination("Seoul", "SiliconValley");
		car2.drive();
	}

	
}