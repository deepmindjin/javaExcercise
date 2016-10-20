
public class StrategyMain {

	public static void main(String[] args) {
		
		// 동일한 명령어에서 내가 입력한 다른 instance에 의해 다른 결과가 나오게 된다
		StrategyInterface strategy = null;
		
		// 1. 전략을 사용할 주체인 컨텍스트를 생성
		Context context = new Context();
		
		// 2. 전략을 선택
		strategy = new Punch();
		// 3. 전략을 Context에 주입 후 사용
		context.runContext(strategy);
		
		strategy = new Kick();
		context.runContext(strategy);

		strategy = new Run();
		context.runContext(strategy);
		
	}
}
