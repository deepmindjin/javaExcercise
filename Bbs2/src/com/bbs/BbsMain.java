package com.bbs;
import java.util.Calendar;
import java.util.Scanner;

public class BbsMain {

	public static void main(String[] args) {

		BbsList list = new BbsList();
		Scanner scan = new Scanner(System.in);
		String id = "";
		String inputValue = "";

		System.out.println("--- 프로그램 실행 ---");
		start: while (true) {
			System.out.println("> 명령어를 입력해 주세요 Write/Exit/Print number/Update/Delete number");
			inputValue = scan.nextLine();

			if (inputValue.equals("Exit")) {
				break start;

			} else if (inputValue.equals("Write")) {
				Post post = new Post();
				setPost(post, scan);
				list.addPost(post);
				System.out.println("> 입력이 완료되었습니다\n");

			} else if (inputValue.startsWith("Print")) {
				if (inputValue.equals("Print")) {
					list.showList();
				} else {
					String temp[] = inputValue.split(" ");
					int num = Integer.parseInt(temp[1]);
					list.showPost(num);
				}
				System.out.println("> Print가 완료되었습니다\n");

			} else if (inputValue.startsWith("Update")) {
				String temp[] = inputValue.split(" ");
				int num = 0;
				try {
					Post post = new Post();
					num = Integer.parseInt(temp[1]);
					post = list.getPost(num);
					setPost(post, scan);
					list.updatePost(post);
					System.out.println("> update가 완료되었습니다\n");
				} catch (Exception e) {
					System.out.println("오류다 오류!!");
				}
			} else if (inputValue.startsWith("Delete")) {
				String temp[] = inputValue.split(" ");
				int num = Integer.parseInt(temp[1]);
				list.deletePost(num - 1);
				System.out.println(num + "번 째 글을 삭제하였습니다");
			} else {
				System.out.println("> 잘못된 입력입니다");
				continue;
			}
			while (true) {
				System.out.println("> 실행을 계속 하시겠습니까 Y/N");
				inputValue = scan.nextLine();
				if (inputValue.equals("Y")) {
					continue start;
				} else if (inputValue.equals("N")) {
					break start;
				} else {
					System.out.println("> 잘못된 입력입니다");
				}
			}
		}
		list.save();
		System.out.println("--- 프로그램을 종료합니다 ---");
	}

	public static void setPost(Post post, Scanner scan) {
		String inputValue = "";
		Calendar day = Calendar.getInstance();

		int year = day.get(Calendar.YEAR);
		int month = day.get(Calendar.MONTH) + 1;
		int day_l = day.get(Calendar.DATE);
		String today = year + "년" + month + "월" + day_l + "일";

		System.out.println("> 글의 제목을 입력해주세요");
		inputValue = scan.nextLine();
		post.title = inputValue;
		System.out.println("> 글의 내용을 입력해주세요");
		// TODO ��?��??? ??��???��? ��?�Ʃ�
		//

		inputValue = scan.nextLine();
		post.contents = inputValue;
		System.out.println("> 작성자를 입력해 주세요");
		inputValue = scan.nextLine();
		while (inputValue.length() > 10) {
			System.out.println("> 작성자는 10자 이하로 입력해주세요");
			inputValue = scan.nextLine();
		}
		post.name = inputValue;
		post.date = today;
	}

}