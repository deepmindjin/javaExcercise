package com.bbs;
import java.io.File;
import java.util.ArrayList;

import com.andrewjang.util.FileUtils;

public class BbsList {

	private final String DB_PATH = "c:/Temp/bbs_db";
	private final String DB_NAME = "bbs.txt";
	private final String DB_FULLPATH = DB_PATH + File.separator + DB_NAME;
	public static final String DB_SEPERATOR = "&";

	public static int count = 0;

	private ArrayList<Post> list = new ArrayList<>();

	public BbsList() {
		FileUtils.createFile(DB_PATH, DB_NAME);
		load(); // load는 다른데서 안읽으니까 private으로 한다
	}

	public void addPost(Post post) {
		count = count + 1;
		post.no = count;
		list.add(post);

	}

	public void showList() {
		if (list.isEmpty() == true) {
			System.out.println("--- 글이 없습니다 ---");
		} else {
			for (Post post : list) {
				post.print();
			}
		}
	}

	public void showPost(int no) {
		Boolean postExist = false;

		for (Post post : list) {
			if (post.no == no) {
				post.print();
				postExist = true;
				break;
			}
		}

		if (!postExist) {
			System.out.println("--- " + no + "번 째 글이 없습니다 ---");
		}
	}

	public Post getPost(int no) {
		Post result = null;

		for (Post post : list) {
			if (post.no == no) {
				result = post;
				break;
			}
		}

		return result;
	}

	public void updatePost(Post newPost) {
		for (Post post : list) {
			if (post.no == newPost.no) {
				int ids = list.indexOf(post);
				list.set(ids, newPost);
				break;
			}
		}
	}

	public void deletePost(int no) {
		Boolean postExist = false;

		for (Post post : list) {
			if (post.no == no-1) {
				list.remove(no-1);
				break;
			}
		}

		if (!postExist) {
			System.out.println("--- " + no + "번 째 글이 없습니다 ---");
		}

	}

	public void save() {
		// List 컬렌셕의 내용을 담을 변수
		StringBuilder sb = new StringBuilder();
		// List 커렉션을 반복하면서 파일에 한줄씩 저장
		for (Post post : list) {
			sb.append(post.no);
			sb.append(DB_SEPERATOR);
			sb.append(post.title);
			sb.append(DB_SEPERATOR);
			sb.append(post.name);
			sb.append(DB_SEPERATOR);
			sb.append(post.contents);
			sb.append(DB_SEPERATOR);
			sb.append(post.date);
			sb.append("\r\n");
		}
		FileUtils.write(DB_FULLPATH, sb.toString());
	}

	private void load() {
		list = FileUtils.read(DB_FULLPATH);
		
		
	}
}
