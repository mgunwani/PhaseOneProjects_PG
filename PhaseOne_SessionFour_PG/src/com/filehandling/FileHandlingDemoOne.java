package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemoOne {
	
	public static void main(String[] args) {
		
		// Creating a new File:
		
		File file = new File("D:\\data.txt");
		try {
			file.createNewFile();
			System.out.println("File Created Successfully..");
		} catch (IOException ex) {
			System.out.println(ex);
		}
		
	}

}
