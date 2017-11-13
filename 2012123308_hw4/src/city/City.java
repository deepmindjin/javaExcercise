package city;

public class City {

	// Variable Declaration
	public final String[] SPEICALS = {"Special", "Metropolitan", "Specific"};
	String name;
	int population;
	double area;
	String kind;
	
	// Constructors
	public City(){};
	public City(String name, int population, double area, String kind){
		this.name = name;
		this.population = population;
		this.area = area;
		this.kind = kind;
	}
	
	// Method Declaration
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", area=" + area + ", kind=" + kind + "]";
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
}
