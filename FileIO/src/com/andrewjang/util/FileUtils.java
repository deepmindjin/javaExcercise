package com.andrewjang.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class FileUtils {

	public static String read(String fileName) {
		StringBuilder result = new StringBuilder();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			InputStreamReader isr = new InputStreamReader(fis,"MS949");
			BufferedReader br = new BufferedReader(isr);
			
			//BufferedInputStream bis = new BufferedInputStream(fis);

//			int chr = 0;
//			while (chr != -1) {
//				chr = bis.read();
//				result.append((char) chr);
//			}
			
			String buffer = "";
			while((buffer = br.readLine())!= null){
				result.append(buffer);
				result.append("\r\n");
				buffer = br.readLine();
			}
			
			
			br.close();
			isr.close(); // 생성의 역순으로 close 해준다
			fis.close();

		} catch (Exception e) {

		}

		return result.toString();
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
	
	
	public static void info(String fileName){
		File file = new File(fileName);
		System.out.println("Length"+file.length());
		System.out.println("Modified"+file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println("Modified"+sdf.format(file.lastModified()));
	}
}
