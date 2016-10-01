package com.andrewjang.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.bbs.BbsList;
import com.bbs.Post;
 

public class FileUtils {

//	public static String read(String fileName) {
//		StringBuilder result = new StringBuilder();
//		try {
//			FileInputStream fis = new FileInputStream(fileName);
//			InputStreamReader isr = new InputStreamReader(fis, "MS949");
//			BufferedReader br = new BufferedReader(isr);
//
//			// BufferedInputStream bis = new BufferedInputStream(fis);
//
//			// int chr = 0;
//			// while (chr != -1) {
//			// chr = bis.read();
//			// result.append((char) chr);
//			// }
//
//			String buffer = "";
//			while ((buffer = br.readLine()) != null) {
//				result.append(buffer);
//				result.append("\r\n");
//				buffer = br.readLine();
//			}
//
//			br.close();
//			isr.close(); // 생성의 역순으로 close 해준다
//			fis.close();
//
//		} catch (Exception e) {
//
//		}
//
//		return result.toString();
//	}
	
	public static ArrayList<Post> read(String fileName) {
		ArrayList<Post> result = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			// BufferedInputStream bis = new BufferedInputStream(fis);

			// int chr = 0;
			// while (chr != -1) {
			// chr = bis.read();
			// result.append((char) chr);
			// }

			String buffer = "";
			int count = 0;
			while (( buffer = br.readLine()) != null) {
				
				String temp[] = buffer.split(BbsList.DB_SEPERATOR);
				Post post = new Post();
				post.no = Integer.valueOf(temp[0]);
				count = post.no;
				post.title = temp[1];
				post.name = temp[2];
				post.contents = temp[3];
				post.date = temp[4];
				result.add(post);
			}
			
			BbsList.count = count;
			
			
			br.close();
			isr.close(); // 생성의 역순으로 close 해준다
			fis.close();

		} catch (Exception e) {

		}

		return result;
	}

	public static void write(String fileName, String contents) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[] byteArray = contents.getBytes();
			bos.write(byteArray);
			bos.close();
			fos.close();

		} catch (Exception e) {

		}
	}

	public static void info(String fileName) {
		File file = new File(fileName);
		System.out.println("Length" + file.length());
		System.out.println("Modified" + file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println("Modified" + sdf.format(file.lastModified()));
	}

	public static void createFile(String path, String fileName) {

		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(path + File.separator + fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void writeInFile(String path, String fileName, String contents) {
		String fileAdress = path + "/" + fileName;
		File file = new File(contents);
	}
}
