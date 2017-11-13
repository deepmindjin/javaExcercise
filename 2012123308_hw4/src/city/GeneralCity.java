package city;

public class GeneralCity extends City{
	// Variable Declaration
	Province province;
	
	// Constructors
	public GeneralCity(){
		super();
	};
	public GeneralCity(String name, int population, double area, String kind, Province province) {
		super(name, population, area, kind);
		this.province = province;
	}
	
	
	// Method Declaration
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	@Override
	public String toString() {
		return "GENERAL_CITY(" + name + ") province:"+province.name+", population=" + population + ", area=" + area
				+ ", kind=" + kind;
	};
	
}
