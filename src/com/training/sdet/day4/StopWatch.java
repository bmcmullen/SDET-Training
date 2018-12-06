package com.training.sdet.day4;

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
	
	public String display() {
		if (endTime == null) {
			return ("Still Running... " 
					+ Duration.between(this.startTime, LocalDateTime.now()).getSeconds());
		} else {
			return ("Responded in - " 
					+ Duration.between(this.startTime, LocalDateTime.now()).getSeconds()
					+ " seconds.");
		}
	}

}
