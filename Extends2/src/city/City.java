package city;

import java.util.ArrayList;

import constructure.Constructure;
import creature.Creature;

/**
 * 
 * @author 장홍석
 *
 */

abstract public class City {
	
	// 속성은 거의 protected로 한다. public은 거의 없음 
	protected double size;
	protected String cityLevel;
	protected int cityNum;
	protected float avg_tempreture;
	protected float avg_rainfall;
	protected StringArrayList<E>	long money;
	
	ArrayList<Creature> creatures = new ArrayList<>();
	ArrayList<Constructure> consturctures = new ArrayList<>();
	
	// Collect tax
	public void collectTax(long money){
		this.money = this.money + money;
	}
	
	// Construct sth
	abstract public void build(Constructure cons);
	
	// Spend money for public welfare 
	public long giveMoney(long money){
		this.money = this.money - money;
		return money;
	}
	
	// A creature come into the city
	public void comeIn(Creature cre){
		creatures.add(cre);
	}
	// A creature go out of the city
	public void comeOut(Creature cre){
		creatures.remove(cre);
	}
	
}
