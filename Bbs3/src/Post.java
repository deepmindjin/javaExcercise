
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
		System.out.println(no+"��° ���Դϴ�");
		System.out.println("�ۼ��� : "+name);
		System.out.println("���� : "+title);
		System.out.println(contents);
		System.out.println("�ۼ��� : "+date);
		System.out.println("");
	}
}
