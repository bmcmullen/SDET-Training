package com.training.sdet.day4;

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		MyBusinessLogic mbl1 = new MyBusinessLogic("MBL-1");
		mbl1.start();
		MyBusinessLogic mbl2 = new MyBusinessLogic("MBL-2");
		mbl2.start();
		MyBusinessLogic mbl3 = new MyBusinessLogic("MBL-3");
		mbl3.start();
		
		try {
			mbl1.join();
			mbl2.join();
			mbl3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("- The MAIN Ends -");
	}
}

// Class must extend Thread if you want to create multiple threads
class MyBusinessLogic extends Thread {
	private String name = "";
	public double myTime = 0.0;
	
	// TODO Some action

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.name + " is killing time.... (" + i + ") " + Thread.currentThread().getName());
			
			// Spend some time doing something (sleeping is good)
			try {
				Thread.sleep((int) (Math.random() * 100000) % 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " Exiting...");
	}
	
	public MyBusinessLogic(String name) {
		this.name = name;
	}

}
