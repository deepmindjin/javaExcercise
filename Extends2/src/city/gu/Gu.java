package city.gu;

import city.City;
import constructure.Constructure;

public class Gu extends City{

	String guLeader;
	
	@Override
	public void build(Constructure cons) {
		cons.built_by = guLeader;
	}
	
}
