package com.training.sdet.day3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperations {
	public static void main(String[] args) throws IOException {
		File file = new File("Sample.txt");

		if (!file.exists()) {
			// Create the file if it wasn't there
			file.createNewFile();
			System.out.println("File Created... ");
		}
		
		System.out.println("File found...");
		System.out.println("Modified time = " + new Date(file.lastModified()));
		// Check out many other properties of File....
		System.out.println("Absolute Path = " + file.getAbsolutePath());
		System.out.println("Path Separator = " + file.separator);
		file.delete();
		System.out.println("File Deleted...");

	}

}
