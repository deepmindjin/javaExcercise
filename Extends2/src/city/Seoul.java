package city;

import constructure.Constructure;

public class Seoul extends City implements Jumin,Input{

	@Override
	public void build(Constructure cons) {
		
	}

	@Override
	public void collectTax(long money) {
		money = (long) (money*0.9f);
		this.money = this.money + money;
	}

	@Override
	public void issue(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void regist(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comeIn(int number) {
		// TODO Auto-generated method stub
		
	}
	
	
}
