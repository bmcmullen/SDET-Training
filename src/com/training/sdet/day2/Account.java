package com.training.sdet.day2;

// This Account class implements Comparable in order to leverage the Arrays.sort
public class Account implements Comparable<Account> {
	// Heap Variables
	public int accoutId;
	public String name;
	public double balance;

	// JVM Stack Variable
	private static int count = ((int) (Math.random() * 100000)) % 1000;

	public Account(String name, double balance) {
		super();

		// For new accounts - set the accoundId from static count
		// - With a random interval between the accountIds
		int randInterval = ((int) (Math.random() * 10)) % 10 + 1;
		// System.out.println("Next Accout ID Offset by " + randInterval);
		this.accoutId = count += randInterval;

		// Remaining Heap Variable from the Constructor
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[Id=" + accoutId + " | Name=" + name + "	| Balance=" + balance + "]";
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccoutId() {
		return accoutId;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	@Override
	// Comparing by highest balance in descending order
	public int compareTo(Account a) {
		return (int) ((int) a.getBalance() - (int) this.getBalance());
	}

	// Added on day3 - for HashSet
	@Override
	public int hashCode() {
		return this.getAccoutId();
	}

	@Override
	public boolean equals(Object obj) {
		Account a = (Account)obj;
		
		// It should be the same account only if the accountId & name are same (balance is mutable)
/*		return (this.accoutId == a.accoutId &&
    		    this.name == a.name);
*/		
		// However since I implemented random ID's  - I need to use just "name"
		return (this.name == a.name);
	}
}
