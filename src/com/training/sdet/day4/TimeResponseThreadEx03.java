package com.training.sdet.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//	Ask the user a question
//	Start another thread that will increment count after every 1 sec.
//	Moment the user to answers, interrupt the thread and
//	Display count and correctness of the answer
//	Use Runnable interface.

public class TimeResponseThreadEx03 implements Runnable {

	@Override
	public void run() {
		// Ask for a response and set endTime as soon as it's received.
	}

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();

		String response = getResponse();
		sw.stop();
		
		System.out.println(sw.display() + "\nTo provide: " + response);
	}

	private static String getResponse() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String r = null;

		try {
			System.out.println("What's up - (You're being timed) ? ...");
			r = br.readLine();

		} catch (IOException e) {
			System.out.println("Some problem getting a phrase" + e);
		}

		return r;
	}
}
