package e;

import f.FMain;

public class EMain {

	/2�� �ϴ� �Լ�
//	public double divTwo(int input){
//		int result;
//		
//		result = (double)input/2;
//		
//		return result;
//	}
	
	public void divide(int n){
		int result = n/2;
		// Main main = new Main(); -�̷��� ���� e�� Main���� ����! �׷��� �����ؾ��Ѵ�
		f.FMain main = new f.FMain();
		
		main.print(result+"");
	}
}