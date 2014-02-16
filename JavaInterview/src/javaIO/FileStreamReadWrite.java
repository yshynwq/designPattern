package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamReadWrite {
	public static void main(String[] args) throws IOException {
		File stin = new File("stockIn.txt");
		File stout = new File("stockOut.txt");

		FileInputStream fis = new FileInputStream(stin);
		FileOutputStream fos = new FileOutputStream(stout);
		int count;
		
		while((count=fis.read())!=-1){
			fos.write(count);
		}
		fis.close();
		fos.close();
	}
}
