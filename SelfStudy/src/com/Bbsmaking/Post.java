package com.Bbsmaking;

public class Post {
	
	// Attributes 
	private int no;
	private String title;
	private String writer;
	private String contents;
	private String time;
	
	// Constructor without parameters
	public Post(){
		no = 0;
		title = "";
		writer = "";
		contents = "";
		time = "";
	}
	
	// Constructor with no, writer, contents (in order)
	public Post(int no, String writer, String title,String contents){
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}
	
	// Print all the attributes
	public void show(){
		System.out.println(getNo()+"번째 글입니다");
		System.out.println("작성자 : "+getWriter());
		System.out.println("제목 : " + getTitle());
		System.out.println(getContents());
		System.out.println("작성시간 : "+getTime());
		System.out.println();
	}
	
	// Getter, setter section below this
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
