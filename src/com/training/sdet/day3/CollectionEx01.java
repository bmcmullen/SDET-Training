package com.training.sdet.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List of variable types of objecFts
public class CollectionEx01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("hello");
		list.add(14.5);
		list.add(false);
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
