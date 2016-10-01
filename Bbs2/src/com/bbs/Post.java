package com.bbs;

public class Post {
	
	// Post number
	public int no;
	// Post title
	public String title;
	// Post contents
	public String contents;
	// Writer
	public String name;
	// Date
	public String date;
	
	public void print(){
		System.out.println(no+"번 째 글입니다");
		System.out.println("작성자 : "+name);
		System.out.println("제목: "+title);
		System.out.println(contents);
		System.out.println("작성일 : "+date);
		System.out.println("");
	}
}
