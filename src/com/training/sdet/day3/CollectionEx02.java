package com.training.sdet.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Playing with String Lists
public class CollectionEx02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Good Insert of String");

		// Compiler issues - Due to type mismatch when not adding <String>
		/*
		 * list.add(false); list.add(45.5);
		 */
		// Duplicates allowed in Lists
		list.add("Dupe");
		list.add("Dupe");

		for (String temp : list) {
			System.out.println(temp);
		}

		// Above is a replaced form of the following
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Original List Size: " + list.size());
		list.remove("Dupe");
		System.out.println("After removing Dupe, List Size: " + list.size() + "\n" + list);

		// Many list methods available to operate on the collection
		// sort, clear, subset
		List<String> sList = list.subList(2, list.size());
		System.out.println(sList);

	}
}
