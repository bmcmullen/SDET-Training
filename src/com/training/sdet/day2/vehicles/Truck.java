package com.training.sdet.day2.vehicles;

public class Truck extends Vehicle {
	private double carryCapacity;

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("This Truck Moves in 4x4 mode @" + this.getSpeed() + " mph.");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Truck stops more slowly from " + this.getSpeed() + " mph.");
	}
	
	@Override
	public String toString() {
		return "Truck [carryCapacity=" + carryCapacity + "]";
	}

	public Truck(int speed, double carryCapacity) {
		super(speed);
		this.carryCapacity = carryCapacity;
	}

	public void carryCapacity() {
		System.out.println("My truck can carry " + this.carryCapacity + " tons.");
	}

}
