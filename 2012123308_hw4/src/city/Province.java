package city;

class Province{
	// Variable Declaration
	String name;
	int nCity;
	City[] city;
	
	//Constructors
	public Province(){super();};
	public Province(String name){
		super();
		this.name = name;
	}
	public Province(String name, int nCity) {
		super();
		this.name = name;
		this.nCity = nCity;
		city = new City[nCity];
	}
	
	//Method Declaration
	// Province의 instance에 각 city를 추가해줍니다.
	public City addCity(City ct){
		nCity++;
		if(nCity==1){
			city = new City[]{ct};
			return city[0];
		}
		
		City[] tempCity = new City[nCity];
		
		for(int i=0;i<nCity-1;i++){
			tempCity[i] = city[i];
		}
			
		tempCity[nCity-1] = ct;
		city = tempCity;
		return city[nCity-1];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getnCity() {
		return nCity;
	}
	public void setnCity(int nCity) {
		this.nCity = nCity;
	}
	public City[] getCity() {
		return city;
	}
	public void setCity(City[] city) {
		this.city = city;
	}
	@Override
	public String toString() {
		String result = "PROVINCE(" + name + ") cities=" + nCity + " \n";
		for(int i=0;i<nCity;i++){
			result += "\t"+city[i].toString();
		}
		return result;
	}
}
