package com.training.sdet.day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStoreAndGet {
	public static void store(Laptop laptop) {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("laptop.ser"));
			
			oos.writeObject(laptop);
			oos.writeInt(100);
			oos.writeChars("Fancy");
			System.out.println("Data Saved... ");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Laptop laptop = new Laptop(1234, "Surface Pro", "Mod X");
		
		store(laptop);
		
	}
}
