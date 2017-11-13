package city;
import txtFileReaderWriter.TXTFileReader;
import txtFileReaderWriter.TXTFileWriter;

public class HW4 {
	static private Province[] province = new Province[20];
	static private int numProvince = 0; 
	static private TXTFileReader reader; 
	static private TXTFileWriter writer;

	// your code here

	public static void main(String[] args) {
		
		readData();
		writer = new TXTFileWriter("Homework4_output.txt");
		
		for (int i = 0; i < numProvince; i++) {
			writer.write("-------------------------------------------------------", true);
			if(province[i]==null)break;
			writer.write(province[i].toString(), true);
		}
		
		writer.write("\n\n==========================================================", true);
		writer.write("City of Highest Population Density", true); 
		City city = highestPopulationDensity(); 
		String tempStr = city.name + " Density: " + city.population / city.area; 
		writer.write(tempStr, true);
		writer.close(); 
	}
		
	static void readData(){
		reader = new TXTFileReader("Homework4_data_eng.txt");
		String temp = "";
		Province pv = null;
		String cityName="";
		String type = "";
		int population=0;
		double area=0;
		int nDistrict = 0;
		City ct = null;
		int counter = 0;
		SpecialCity spc = null;
		
		reader = new TXTFileReader("Homework4_data_eng.txt");
		temp = reader.readString();
		do{
//			System.out.println(temp);
			counter++;
//			System.out.println("--counter: "+counter);
			//각 도시의 parameter가 다르기때문에 지금 읽고 있는 String이 
			//어떠한 부분인지 구별하기 위해서 counter라는 변수를 사용했습니다.
			switch(counter){
				case 1:
					pv = province[checkProvince(temp)];
					break;
				case 2:
					cityName = temp;
					break;
				case 3:
					type = temp;
					break;
				case 4:
					population = Integer.parseInt(temp);
					break;
				case 5:
					area = Double.parseDouble(temp);
					//기본적으로 area까지는 공통으로 가지고 있기 때문에, 여기까지는 동시에 받아옵니다.
					if(type.equals("General")||cityName.equals("Sejong")){
//						System.out.println("--General city--");
						ct = new GeneralCity(cityName, population, area, type, pv);
						pv.addCity(ct);
						// General일 경우 counter를 0으로 만들어 다음에 오는 것이 새로운 argument라고 말해줍니다.
						counter=0;
					}else{
						// 아닐경우 Special City라고 인식하고 새롭게 만듭니다. 
//						System.out.println("--Special city--");	
						ct = new SpecialCity(cityName, population, area, type, pv);
						pv.addCity(ct);
					}
//					System.out.println("--"+ct.toString());
					break;
				case 6:
					nDistrict = Integer.parseInt(temp);
//					System.out.println("nDistrict: "+nDistrict);
					break;
				// strict들을 인식하는 부분
				case 7:
					spc = (SpecialCity)ct;
					spc.setnDistrict(nDistrict);
				default:
					spc.addDistrict(temp);
					if(counter-6==nDistrict){
						counter=0;
					}
					break;
			}
			temp = reader.readString();
		}while(temp!=null);
				
		numProvince = province.length;
		reader.close();
		
		// Check validity
		for(int i=0;i<numProvince-1;i++){
			if(province[i] == null) break;
			System.out.println(province[i].toString());
		}
	}
	
	// 주어진 String 이름값을 가진 Province가 있는 지 확인인하고, 없으면 새로 추가하고 index값을, 
	// 있으면 그 Province의 index를 return합니다.
	static int checkProvince(String nameTesting){
		for(int i=0;i<numProvince;i++){
			if(province[i].name.equals(nameTesting)){
				return i;
			}
		}
		numProvince++;
		province[numProvince-1] = new Province(nameTesting);
		return numProvince-1;
	}
	
	static City checkCity(Province pv, String nameTesting){
		for(int i=0;i<pv.nCity;i++){
			if(pv.city[i].name==nameTesting){
				return pv.city[i];
			}
		}
		City ct = new City();
		return pv.addCity(ct);
	}
	
	static City highestPopulationDensity(){
		City popCity = province[0].city[0];
		double density = popCity.population/popCity.area;
		City comparedCity = null;
		Province pv = null;
		for(int i=0;i<numProvince;i++){
			if(province[i]==null)break;
			pv = province[i];
			for(int j=0;j<pv.nCity;j++){
				if(pv.city[j]==null)break;
				comparedCity = pv.city[j];
				if(density<comparedCity.population/comparedCity.area){
					popCity = comparedCity;
					density = comparedCity.population/comparedCity.area;
				}
			}
		}
		return popCity;
	}

}
