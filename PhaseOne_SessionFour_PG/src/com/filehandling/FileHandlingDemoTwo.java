package com.filehandling;

import java.io.File;

public class FileHandlingDemoTwo {

	public static void main(String[] args) {

		// Creating a new File:

		File file = new File("D:\\data.txt");
		file.delete();
		System.out.println("File Deleted Successfully..");

	}

}
