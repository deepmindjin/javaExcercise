
public class StrategyFactoryMethod {

	public static StrategyInterface newInstance(String name){
		if(name.equals("Run")){
			return new Run();
		}else if(name.equals("Punch")){
			return new Punch();
		}else if(name.equals("Kick")){
			return new Kick();
		}else{
			return null;
		}
	}
	
}
