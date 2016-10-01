package com.Bbsmaking.Main;

import java.util.Calendar;
import java.util.Scanner;

import com.Bbsmaking.BbsList;
import com.Bbsmaking.Post;

public class BbsMain {

	public static void main(String[] args) {
		// Attributes for auto date recording
		Calendar today = Calendar.getInstance();
		int year = today.YEAR;
		int month = today.MONTH + 1;
		int date = today.DATE;
		String time = year + "년 " + month + "월 " + date + "일";

		Scanner scan = new Scanner(System.in);
		String input;
		String choice;
		BbsList list = new BbsList();

		// Start the program
		System.out.println("--- 프로그램을 시작합니다 ---");

		whole: while (true) {
			System.out.println("> 명령어를 입력해주세요");
			System.out.println("/print, /add, /delete, /update, /exit");
			input = scan.nextLine();
			if (input.startsWith("/add")) {
				Post post = new Post();
				mkPost(scan, post);
				post.setTime(time);
				list.addPost(post);
				System.out.println("> 작성이 완료되었습니다");
			} else if (input.startsWith("/print")) {
				if (list.count == 0) {
					System.out.println("출력할 글이 없습니다");
					System.out.println("");
					continue whole;
				}
				try {
					choice = getInput(scan);
					if (choice.startsWith("all")) {
						list.showList();
					} else {
						list.showPost(Integer.parseInt(choice));
					}
					System.out.println("> 출력이 완료되었습니다");
				} catch (Exception e) {
					System.out.println("오류가 발생하였습니다 in print");
				}
			} else if (input.startsWith("/delete")) {
				choice = getInput(scan);
				if (choice == "all") {
					for (int i = 0; i < list.count - 1; i++) {
						list.deletePost(i);
					}
				} else {
					list.deletePost(Integer.parseInt(choice));
				}
				System.out.println("> 삭제가 완료되었습니다");
			} else if (input.startsWith("/update")) {
				int updateNum = 0;
				System.out.println("update할 글의 번호를 입력해주세요.");
				input = scan.nextLine();
				updateNum = Integer.parseInt(input);
				Post post = new Post();
				post = mkPost(scan, post);
				post.setTime(time);
				post.setNo(updateNum);
				list.updatePost(updateNum, post);
				System.out.println("> " + updateNum + "번 째 글이 갱신되었습니다");
			} else if (input.startsWith("/exit")) {
				break whole;
			} else {
				System.out.println("> 잘못된 입력입니다");
			}
			System.out.println("");
		}
		System.out.println("--- 프로그램을 종료합니다 ---");
	}

	public static Post mkPost(Scanner scan, Post post) {
		String input;

		System.out.println("작성자를 입력해 주세요");
		input = scan.nextLine();
		post.setWriter(input);

		System.out.println("제목을 입력해 주세요");
		input = scan.nextLine();
		post.setTitle(input);

		System.out.println("내용을 입력해 주세요");
		input = scan.nextLine();
		post.setContents(input);

		return post;

	}

	public static String getInput(Scanner scan) {
		String result;

		System.out.println("> 번호를 입력해 주세요. 전체선택을 하시려면 all을 입력해주세요");
		result = scan.nextLine();

		return result;
	}

}
