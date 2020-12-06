package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileHandlingDemoFour {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream(new File("D:\\data.txt"));
		String data = "Hello World..";
		os.write(data.getBytes(), 0, data.length());
		System.out.println("File Write Operation Completed Successfully..");
	}

}
