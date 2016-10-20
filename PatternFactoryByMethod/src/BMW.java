
public class BMW extends Car {
	
	public BMW(String name){
		super(name);
	}

	@Override
	public void setDestination(String from, String to) {
		super.setFrom(from);
		super.setTo(to);
	}

}
