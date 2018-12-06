package com.training.sdet.day2;

// Creation of a public class for utility methods
public class MyMath {
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int sub(int num1, int num2){
		return num1 - num2;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,15));
		System.out.println(sub(15,10));
	}
	
	// Static blocks are executed when class is loaded into heap.
	//	 Placed here in class definition to highlight the fact that it
	//	 will occur prior to the execution of "main".
	static {
		System.out.println("MyMath Functions have been defined.");
	}
}
