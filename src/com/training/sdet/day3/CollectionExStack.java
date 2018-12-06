package com.training.sdet.day3;

import java.util.Stack;

public class CollectionExStack {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();

		// Let's see what a starting stack looks like...
		System.out.println(s);

		// Order the place setting for a formal dinner
		s.push("Setting Plate");
		s.push("Dinner Plate");
		s.push("Salad Plate");

		System.out.println(s);

		// See what's on top of the stack
		System.out.println(s.peek());

		// Serve Salad, Soup, & Then Dinner
		s.pop(); // Salad

		s.push("Soup Bowl"); // Place the Soup Course
		s.pop();
		System.out.println(s);

		s.pop(); // Dinner
		s.clear(); // clear setting before dessert

		s.push("Dessert Service");
		System.out.println(s);
		s.pop();
	}

}
