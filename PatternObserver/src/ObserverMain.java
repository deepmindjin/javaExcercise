import java.util.ArrayList;
import java.util.Scanner;

public class ObserverMain {

	public static void main(String[] args) {
		TargetJob target = new TargetJob();
		new Binary(target);
		new Hex(target);
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("Enter a Number");
			target.setNumber(scan.nextInt());
		}
	}

}

// 옵저버가 바라보고 있는 실행 테스크
class TargetJob{
	//현재 테스크를 바라보는 옵저버들을 등록해 두는 배열
	private ArrayList<Observer> observers = new ArrayList<>();
	int number = 0;
	// 옵저버를 등록해준다
	public void attatch(Observer observer){
		observers.add(observer);
	}
	// 실행 테스크에 값을 입력하고, 변경사항이 있음을 알려준다
	public void setNumber(int number){
		this.number = number;
		notifyChanged();
	}
	// 실행 테스크에 변경사항이 있으면 전체 옵저버에 알려준다.
	private void notifyChanged(){
		for(Observer o : observers){
			o.update(number);
		}
	}
}

class Binary implements Observer{
	TargetJob target;
	
	public Binary(TargetJob target){
		target.attatch(this);
	}
	
	@Override
	public void update(int message){
		System.out.println("Binary:"+Integer.toBinaryString(message));
	}
}

class Hex implements Observer{
	TargetJob target;
	
	public Hex(TargetJob target){
		target.attatch(this);
	}
	
	@Override
	public void update(int message){
		System.out.println("Hex:"+Integer.toHexString(message));
	}
}

interface Observer {
	// 내부에서 이변수를 사용해야해서 interface가 아닌 abstract class로 한다
	public void update(int message);
}
