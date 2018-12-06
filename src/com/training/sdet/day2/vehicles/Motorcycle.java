package com.training.sdet.day2.vehicles;

public class Motorcycle extends Vehicle {
	int range;

	public Motorcycle(int speed, int range) {
		super(speed);
		// TODO Auto-generated constructor stub
		this.range = range;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		super.brake();
	}

	@Override
	public String toString() {
		return "Motorcycle [range=" + range + "]";
	}

	public void range() {
		System.out.println("My motorcycle has a range of " + this.range + " miles.");
	}
}
