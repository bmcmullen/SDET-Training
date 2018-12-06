package com.training.sdet.day2.vehicles;

// Created as abstract to prevent an instance of this 'abstract' class
abstract class Vehicle {
	private int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	protected int getSpeed() {
		return speed;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}

	// These methods should be overridden by any child class.
	public void move() {
		// System.out.println("Vehicle is Moving @" + speed + " mph.");
		System.out.println("Exception - Should define a move for your vehicle.");
	}

	public void brake() {
		// System.out.println("Vehicle is Stopping from " + speed + " mph.");
		System.out.println("Exception - Should define a brake for your vehicle.");
	}
}
