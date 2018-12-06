package com.training.sdet.day2.vehicles;

public class Car extends Vehicle {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("This Car Moves @" + this.getSpeed() + " mph.");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Car is Stopping from " + this.getSpeed() + " mph.");
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", fuelCapacity=" + fuelCapacity + "]";
	}

	private int doors;
	private int fuelCapacity;

	public Car(int speed, int doors, int fuelCapacity) {
		super(speed);
		this.doors = doors;
		this.fuelCapacity = fuelCapacity;
	}

	public void doors() {
		System.out.println("My car has " + this.doors + " doors.");
	}

	public void fuelCapacity() {
		System.out.println("My car holds " + this.fuelCapacity + " gallons of fuel.");
	}
}
