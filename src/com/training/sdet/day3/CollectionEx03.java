package com.training.sdet.day3;

import java.util.Vector;

// Playing with Vector
public class CollectionEx03 {
	public static void main(String[] args) {
		// At construction you can set the initial size and incremental capacity
		Vector<String> v = new Vector<>(5, 3);

		System.out.println("Vectors have Size & Capacity - \n" + "Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("fize");
		System.out.println("Size: " + v.size() + "	Capacity: " + v.capacity());
	}
}
