package com.Bbsmaking;

import java.util.ArrayList;

public class BbsList {

	ArrayList<Post> list = new ArrayList<>();
	Post post = new Post();
	public int count = 0;

	// Constructor without parameters
	public BbsList() {
	}

	// Add post to list
	public void addPost(Post post) {
		count = count + 1;
		post.setNo(count);
		list.add(post);
	}

	// Delete post in list having given no
	public void deletePost(int no) {
		list.remove(no - 1);
		count = count - 1;
	}

	// Show a post with given no
	public void showPost(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (no == list.get(i).getNo()) {
				list.get(i).show();
				break;
			}
		}
	}

	// Show all the posts in the list
	public void showList() {
		for (Post post : list) {
			post.show();
		}
	}

	// Update a post having given no with a new POst
	public void updatePost(int no, Post post) {
		list.remove(no - 1);
		list.add(no - 1, post);
	}

	// Getter, Setter section below this

	public ArrayList<Post> getList() {
		return list;
	}

	public void setList(ArrayList<Post> list) {
		this.list = list;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
