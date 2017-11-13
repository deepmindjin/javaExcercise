package city;

public class SpecialCity extends GeneralCity{
	// Variable Declaration
	int nDistrict;
	String[] district;
	int counter = 0;
	
	// Constructors
	public SpecialCity() {
		super();
	}
	
	public SpecialCity(String name, int population, double area, String kind, Province province) {
		super(name, population, area, kind, province);
	}

	public SpecialCity(String name, int population, double area, String kind, Province province, int nDistrict) {
		super(name, population, area, kind, province);
		this.nDistrict = nDistrict;
		district = new String[nDistrict];
	}
	
	// Method Declaration
	public void addDistrict(String districtName){
		district[counter] = districtName;
		counter++;
	}
	public int getnDistrict() {
		return nDistrict;
	}
	public void setnDistrict(int nDistrict) {
		this.nDistrict = nDistrict;
		district = new String[nDistrict];
	}
	public String[] getDistrict() {
		return district;
	}
	public void setDistrict(String[] district) {
		this.district = district;
	}
	@Override
	public String toString() {
		String result = "SPECIAL_CITY("+name+") ["+this.kind+"] province: "+province.name+", population: "+population+", area: "+area+", district("
				+nDistrict+") ";
		for(int i=0;i<nDistrict;i++){
			result += district[i]+" ";
		}
		return result;
	}
	
}

