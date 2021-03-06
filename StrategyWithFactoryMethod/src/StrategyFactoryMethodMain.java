
public class StrategyFactoryMethodMain {

	public static void main(String[] args) {
		Context context = new Context();
		StrategyInterface strategy;
		strategy = StrategyFactoryMethod.newInstance("Punch");
		context.runContext(strategy);
		strategy = StrategyFactoryMethod.newInstance("Kick");
		context.runContext(strategy);
		strategy = StrategyFactoryMethod.newInstance("Run");
		context.runContext(strategy);
	}

}
