
public class CarFactory {
	
	public static Car newInstance(String key){
		
		if(key.equals("포르쉐")){
			return new Porsche("Panamera");
		}else if(key.equals("BMW")){
			return new BMW("i8");
		}else if(key.equals("Volvo")){
			return new Volvo("Volvo_SUV");
		}else{
			return null;
		}
	}
}
