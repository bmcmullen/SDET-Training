package com.training.sdet.day3;

import java.io.File;
import java.io.IOException;

public class FileOperatoinsEx02 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Huser\\Desktop\\Brian SDET Files\\testFiles");

		String[] list = file.list();

		for (String temp : list) {
			File f = new File(file, temp);

			// Find the files in the path which are not writable
			System.out.println("These are the read-only files in your test folder...");
			if (f.isFile() && !f.canWrite()) {
				System.out.println("File Name:" + f.getName());
			}
		}
	}
}
