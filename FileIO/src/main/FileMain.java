package main;

import com.andrewjang.util.FileUtils;

public class FileMain {

	public static void main(String[] args) {

		String contents = FileUtils.read("C:/workspace\\java/Bbs2/src/BbsMain.java");

		System.out.println(contents);

		FileUtils.write("C:/Temp/ccc.java", contents);
		
		FileUtils.info("C:/Temp/ccc.java");
	}

}
