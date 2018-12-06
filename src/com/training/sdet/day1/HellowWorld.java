package com.training.sdet.day1;

public class HellowWorld {
	public static void main(String[] args) {
		System.out.println("Hello World, Love the IDE Short Cuts.");

		System.out.println("You've sent me " + args.length + " arguments.");

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
