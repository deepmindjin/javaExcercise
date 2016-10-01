import java.util.ArrayList;

public class BbsMain {
	// 이 내부에 클래스가 생성되면
	// BbsMain$Post.class라고 생성이 된다
	
//	static Post[] postList = new Post[100];
	
	public static void main(String[] args) {
		
		ArrayList<Post> postList = new ArrayList<>();
	
		//밑의 2줄은 array llist를 사용하지 않을 때
//		BbsMain bbsMain = new BbsMain();
//		bbsMain.postList = new Post[3];
//				
		// 텍스트 필드를 가상으로 만들어서 사용중....
//		Post post1 = new Post();
//		post1.title = "제목";
//		post1.writer = "홍길동";
//		post1.date = "2016-09-08";
//		post1.contents = "코딩을 열심히 배우자 :)";

		
//		Post post2 = new Post();
//		post2.title = "아침";
//		post2.writer = "장홍석";
//		post2.date = "2016-09-08";
//		post2.contents = "어제먹은 샐러드는 참 맛있었다";

		
//		Post post3 = new Post();
//		post3.title = "점심";
//		post3.writer = "장홍석";
//		post3.date = "2016-09-08";
//		post3.contents = "오늘은 뭘 먹으면 잘먹었다는 소문이 날까?";
		
//		postList[0] = post1;
//		postList[1] = post2;
//		postList[2] = post3;		
		
		Post post1 = new Post("제목","홍길동","2016-09-08","코딩을 열심히 배우자:)");
		Post post2 = new Post("아침", "장홍석", "2016-09-08","어제먹은 샐러드는 참 맛있었다");
		Post post3 = new Post("점심", "장홍석", "2016-09-08", "오늘은 뭘 먹으면 잘 먹었다는 소문이 날까?");
	
		postList.add(post1);
		postList.add(post2);
		postList.add(post3);
		
//		int postListSize = postList.size();
//		for(int i=0;i<postListSize;i++){
//			postList.get(i).print();
//		}
		
		for(Post p : postList){
			p.print();
		}
	}
}

// 글 하나를 가진 클래스 
class Post{
	
	// 글번호
	int no;
	// 제목 
	String title;
	// 작성자
	String writer;
	// 작성일자
	String date;
	// 내용
	String contents;
	
	public Post(){
		no = 0;
		title = "";
		writer = "";
		date = "";
		contents = "";
		System.out.println("post instance가 생성되었습니다");
	}
	
	public Post(String title, String writer, String date, String contents){
		no = 0;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.contents = contents;
		System.out.println("post instance가 생성되었습니다");
	}
	
	public void print(){
		System.out.println("");
		System.out.println(no);
		System.out.println(title);
		System.out.println(writer);
		System.out.println(date);
		System.out.println(contents);
		
	}


}