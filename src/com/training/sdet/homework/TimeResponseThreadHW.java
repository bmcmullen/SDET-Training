package com.training.sdet.homework;

//	Ask the user a question
//	Start another thread that will increment count after every 1 sec.
//	Moment the user to answers, interrupt the thread and
//	Display count and correctness of the answer
//	Use Runnable interface.

public class TimeResponseThreadHW implements Runnable {
	private StopWatch sw;
	private Thread t;

	@Override
	public void run() {
		// Ask for a response and set endTime as soon as it's received.
		synchronized (sw) {
			sw.timeResponse();
		}
	}

	public TimeResponseThreadHW(StopWatch sw, String timerName) {
		this.sw = sw;
		t = new Thread(this, timerName);
		t.start();
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();

		// See who's faster as a response ;)
		// Does it depend on the threading/controller?
		new TimeResponseThreadHW(sw, "Brian");
		new TimeResponseThreadHW(sw, "Ashwini");
		new TimeResponseThreadHW(sw, "Frank");
	}

}
