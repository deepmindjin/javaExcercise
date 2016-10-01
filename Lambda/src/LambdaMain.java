
public class LambdaMain {

	public static void main(String[] args) {
		
		Sum sum = (a)->{System.out.println(a);};
		
		sum.absRun(10);
	}

}