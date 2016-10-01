import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class BbsMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Post> list = new HashMap<>();
		int listCount = 1;
		String id = "";
		String inputValue = "";
		Calendar day = Calendar.getInstance();
		int year = day.get(day.YEAR);
		int month = day.get(day.MONTH)+1;
		int day_l = day.get(day.DATE);
		String today = year + "�� " + month+ "�� " +day_l +"��";
		
		System.out.println("--- ���α׷� ���� ---");
		System.out.println("> ���̵� �Է��� �ּ���");
		inputValue = scan.nextLine();
		while(inputValue.length()>10){
			System.out.println("> ���̵�� 10�� ���Ϸ� �Է��ϼ���");
			inputValue = scan.nextLine();
		}
		id = inputValue;
		
		
			start : while(true){
				System.out.println("> ��ɾ �Է��ϼ���  Write/Exit/Print number");
				inputValue = scan.nextLine();
				
				if(inputValue.equals("Exit")){
					break;
					
				}else if(inputValue.startsWith("Print")){
					if(inputValue.equals("Print")){
						for(Integer p : list.keySet()){
							list.get(p).print();
						}
					}else {
						String temp[] = inputValue.split(" ");
						int num = Integer.parseInt(temp[1]);
						list.get(num).print();
						
					}
					System.out.println("> ����� �������ϴ�\n");
					while(true){
						System.out.println("> ����Ͻðڽ��ϱ�? Y/N");
						inputValue = scan.nextLine();
						if(inputValue.equals("Y")){
							continue start;
						}else if(inputValue.equals("N")){
							break start;
						}else{
							System.out.println("> �߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���");
						}
					}
					
				}else if(inputValue.equals("Write")){
					Post post = new Post();		
					System.out.println("> ���� ������ �Է��� �ֽʽÿ�");
					inputValue = scan.nextLine();
					post.title = inputValue;
					System.out.println("> ���� ������ �Է��� �ֽʽÿ�");
					inputValue = scan.nextLine();
					post.contents = inputValue;
					post.no = listCount++;
					post.name = id;
					post.date = today;
					list.put(post.no,post);
					System.out.println("> �ԷµǾ����ϴ�\n");
				}else{
					System.out.println("> �߸��� �Է��Դϴ�\n�ٽ� �Է��� �ּ���");
					continue;
				}
			}
			System.out.println("--- ���α׷� ���� ---");
	}
}