
public class Post {
	
	// Post number
	int no;
	// Post title
	String title;
	// Post contents
	String contents;
	// Writer
	String name;
	// Date
	String date;
	
	public void print(){
		System.out.println(no+"번째 글입니다");
		System.out.println("작성자 : "+name);
		System.out.println("제목 : "+title);
		System.out.println(contents);
		System.out.println("작성일 : "+date);
		System.out.println("");
	}
}
