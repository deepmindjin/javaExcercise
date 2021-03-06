
public abstract class Car {
	
	public abstract void setDestination(String from, String to);
	
	
	private String name;
	private String to;
	private String from;
	
	public Car(String name){
		this.name = name;
	} 
	
	public void drive(){
		System.out.println(
				"I will drive from "
				+from + " to "
				+to+" with "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
}
