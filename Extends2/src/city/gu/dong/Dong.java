package city.gu.dong;

import city.City;
import constructure.Constructure;

public class Dong extends City{
	
	String dongLeader;
	
	@Override
	public void build(Constructure cons) {
		cons.built_by = dongLeader;
	}

}
