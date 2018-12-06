package com.training.sdet.day3;

import java.util.TreeSet;

import com.training.sdet.day2.Account;

public class SetEx01HashSet {
	public static void main(String[] args) {
		TreeSet<Account> set = new TreeSet<>();
				
		// Going to put Account from day2 into this Hash Set
		set.add(new Account("Alfred", 4105.50));
		set.add(new Account("Bertha", 5002.42));		
		set.add(new Account("Charles", 1503.81));
		set.add(new Account("Denver", 2240.00));
		set.add(new Account("Elsie", 4105.25));

		// Iterate over the Hash Set and display the items with HashCode
		for (Account a : set) {
			System.out.println("Account: " + a.hashCode() + "	" + a);
		}

		// Create a new Account with same name different balance (check the set)
		if (set.contains(new Account("NotHere", 2240.00))) {
			System.out.println("This account is in the HashSet");
		} else {
			System.out.println("This account is NOT in the HashSet");
		}
	}
}
