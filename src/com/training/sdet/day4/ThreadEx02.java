package com.training.sdet.day4;

class ParentClass {
}

class RunnableClass extends ParentClass implements Runnable {
	private Thread t;
	// private String tName;

	public RunnableClass(String tName, int priority) {
		t = new Thread(this, tName);
		t.setPriority(priority);

		// Passing to OS the control to the scheduler
		t.start();
	}

	public RunnableClass() {}

	@Override
	public void run() {
		for (int i = 0; i < (int) (Math.random() * 100) % 100; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}
		System.out.println(Thread.currentThread() + " EXITING... ");
	}

}

// class MyThreadClass

public class ThreadEx02 {
	public static void main(String[] args) {
		RunnableClass rcLowP = new RunnableClass("LowestP", Thread.MIN_PRIORITY);
		RunnableClass rcBrian = new RunnableClass("Brian-N", Thread.NORM_PRIORITY);
		RunnableClass rcBPlus = new RunnableClass("BPlus+2", Thread.NORM_PRIORITY + 2);
		RunnableClass rcBHigh = new RunnableClass("MaxPrio", Thread.MAX_PRIORITY);
		
		Thread newt = new Thread(new RunnableClass());
		newt.setName("RaceThread");
		newt.setPriority(Thread.MAX_PRIORITY);
		newt.start();
		
	}
}
