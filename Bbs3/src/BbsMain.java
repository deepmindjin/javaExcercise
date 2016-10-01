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
		String today = year + "년 " + month+ "월 " +day_l +"일";
		
		System.out.println("--- 프로그램 시작 ---");
		System.out.println("> 아이디를 입력해 주세요");
		inputValue = scan.nextLine();
		while(inputValue.length()>10){
			System.out.println("> 아이디는 10자 이하로 입력하세요");
			inputValue = scan.nextLine();
		}
		id = inputValue;
		
		
			start : while(true){
				System.out.println("> 명령어를 입력하세요  Write/Exit/Print number");
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
					System.out.println("> 출력이 끝났습니다\n");
					while(true){
						System.out.println("> 계속하시겠습니까? Y/N");
						inputValue = scan.nextLine();
						if(inputValue.equals("Y")){
							continue start;
						}else if(inputValue.equals("N")){
							break start;
						}else{
							System.out.println("> 잘못된 입력입니다. 다시 입력해 주세요");
						}
					}
					
				}else if(inputValue.equals("Write")){
					Post post = new Post();		
					System.out.println("> 글의 제목을 입력해 주십시오");
					inputValue = scan.nextLine();
					post.title = inputValue;
					System.out.println("> 글의 내용을 입력해 주십시오");
					inputValue = scan.nextLine();
					post.contents = inputValue;
					post.no = listCount++;
					post.name = id;
					post.date = today;
					list.put(post.no,post);
					System.out.println("> 입력되었습니다\n");
				}else{
					System.out.println("> 잘못된 입력입니다\n다시 입력해 주세요");
					continue;
				}
			}
			System.out.println("--- 프로그램 종료 ---");
	}
}