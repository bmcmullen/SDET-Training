package com.training.sdet.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDateTime;

public class StopWatch {
	private LocalDateTime startTime = LocalDateTime.now();
	private LocalDateTime endTime = null;

	public StopWatch() {
		this.startTime = LocalDateTime.now();
	}

	public void stop() {
		this.endTime = LocalDateTime.now();
	}

	public void reset() {
		this.startTime = LocalDateTime.now();
		this.endTime = null;
	}

	public void timeResponse() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String r = null;

		try {
			System.out.println("What's up - (You're being timed) ? ...");
			r = br.readLine();
			stop();

		} catch (IOException e) {
			System.out.println("Some problem getting a phrase" + e);
		}
		if (endTime == null) {
			System.out.println("Running... ");
		} else {
			System.out.println("Responded in - " 
						+ Duration.between(this.startTime, LocalDateTime.now()).getSeconds()
						+ " seconds.");
		}
	}

}
