package com.training.sdet.day2;

public class ExcptTesting {
	public static void main(String[] args) {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		try {

			int result = n1 / n2;

			System.out.println("Result of Divide = " + result);
		} catch (ArithmeticException ae) {
			System.out.println("Expected Arithmetic Exception." + ae);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Clean up of resources!!!");
		}

		System.out.println("\nSuccessfully managed any issues, and proceeded with processing...");

	}
}
