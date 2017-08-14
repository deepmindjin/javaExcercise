import java.util.ArrayList;

public class BbsMain {
	
//	static Post[] postList = new Post[100];
	
	public static void main(String[] args) {
		
		ArrayList<Post> postList = new ArrayList<>();
	
//		BbsMain bbsMain = new BbsMain();
//		bbsMain.postList = new Post[3];
//				
//		Post post1 = new Post();
//		post1.title = "����";
//		post1.writer = "ȫ�浿";
//		post1.date = "2016-09-08";
//		post1.contents = "�ڵ��� ������ ����� :)";

		
//		Post post2 = new Post();
//		post2.title = "��ħ";
//		post2.writer = "��ȫ��";
//		post2.date = "2016-09-08";
//		post2.contents = "�������� ������� �� ���־���";

		
//		Post post3 = new Post();
//		post3.title = "����";
//		post3.writer = "��ȫ��";
//		post3.date = "2016-09-08";
//		post3.contents = "������ �� ������ �߸Ծ��ٴ� �ҹ��� ����?";
		
//		postList[0] = post1;
//		postList[1] = post2;
//		postList[2] = post3;		
		
		Post post1 = new Post("����","ȫ�浿","2016-09-08","�ڵ��� ������ �����:)");
		Post post2 = new Post("��ħ", "��ȫ��", "2016-09-08","�������� ������� �� ���־���");
		Post post3 = new Post("����", "��ȫ��", "2016-09-08", "������ �� ������ �� �Ծ��ٴ� �ҹ��� ����?");
	
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

// �� �ϳ��� ���� Ŭ���� 
class Post{
	
	// �۹�ȣ
	int no;
	// ���� 
	String title;
	// �ۼ���
	String writer;
	// �ۼ�����
	String date;
	// ����
	String contents;
	
	public Post(){
		no = 0;
		title = "";
		writer = "";
		date = "";
		contents = "";
		System.out.println("post instance�� �����Ǿ����ϴ�");
	}
	
	public Post(String title, String writer, String date, String contents){
		no = 0;
		this.title = title;
		this.writer = writer;
		this.date = date;
		this.contents = contents;
		System.out.println("post instance�� �����Ǿ����ϴ�");
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