package com.training.sdet.day2;

import java.util.Arrays;
import java.util.Comparator;

public class AccountClient {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];

		accounts[0] = new Account("Alfred", 4105.50);
		accounts[1] = new Account("Bertha", 5002.42);
		accounts[2] = new Account("Charles", 1503.81);
		accounts[3] = new Account("Denver", 2240.00);
		accounts[4] = new Account("Elsie", 4105.25);

		System.out.println("List of Accounts Sorted the Comparable compareTo -----");
		Arrays.sort(accounts);
		for (Account a : accounts) {
			System.out.println("Account: " + a);
		}

		Comparator<Account> compareBasedOnID = new Comparator<Account>() {
			@Override
			public int compare(Account a, Account b) {
				return a.getAccoutId() - b.getAccoutId();
			}
		};

		System.out.println("List of Accounts Sorted By ID -----");
		Arrays.sort(accounts, compareBasedOnID);
		for (Account a : accounts) {
			System.out.println("Account: " + a);
		}
	}
}
