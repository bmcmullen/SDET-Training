package com.training.sdet.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperationEx01 {

	public static void main(String[] args) throws IOException {
		File file = new File("favoriteInt.txt");
		
		int favoriteInteger = requestInteger();
		System.out.println("That's a beautiful integer: " + favoriteInteger);
		writeFavorteInt2File(favoriteInteger, file);
		System.out.println("I've printed this to the file for you.");

		displayFavoriteNumbers(file);
	}

	private static void displayFavoriteNumbers(File file) throws FileNotFoundException, IOException {
		System.out.println("\n\n *** Your Favorite Integers So Far:\n");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

	private static void writeFavorteInt2File(int favoriteInteger, File file) {
		FileWriter fw = null;
		try {

			fw = new FileWriter(file, true);
			if (!file.exists()) {
				// Create the file if it wasn't there
				file.createNewFile();
				System.out.println("File Created... ");
			}
			fw.write(Integer.toString(favoriteInteger) + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block    
				e.printStackTrace();
			}
		}
	}

	private static int requestInteger() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		while (i == 0) {
			try {
				System.out.println("Enter Some Integer Value:");
				i = Integer.parseInt(br.readLine());

			} catch (NumberFormatException | IOException e) {
				System.out.println("Try again to enter an integer -" + e);
			}
		}

		return i;
	}
}
