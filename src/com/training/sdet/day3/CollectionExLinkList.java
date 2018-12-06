package com.training.sdet.day3;

import java.util.LinkedList;

// Play a little with a linked list
public class CollectionExLinkList {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();

		// Let's create a linked list of fine China pieces in our collection
		// What does it look like first
		System.out.println(ll);

		// Add some entries
		ll.add("Dinner Plate");
		ll.addFirst("Cup");
		ll.addLast("Saucer");
		ll.add("Bowl");
		ll.add("Serving Plate");
		ll.add("Cup");
		ll.addLast("Cup");
		
		System.out.println(ll);	

		// Sort the linked list with default <String> comparator
		ll.sort(null);
		System.out.println("Sorted-" + ll);
	}
}
