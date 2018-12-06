package com.training.sdet.day2.vehicles;

public class VehicleClient {
	public static void display(Vehicle vehicle) {
		System.out.println("*****");
		vehicle.move();
		vehicle.brake();
		if (vehicle instanceof Car) {
			((Car) vehicle).doors();
			((Car) vehicle).fuelCapacity();
		} else if (vehicle instanceof Truck) {
			((Truck) vehicle).carryCapacity();
		} else if (vehicle instanceof Motorcycle) {
			((Motorcycle) vehicle).range();
		}
	}

	public static void main(String[] args) {
		// Vehicle vehicle = new Car(75, 3, 12);
		// display(vehicle);
		// vehicle = new Truck(65, 2.5);
		// display(vehicle);

		// Create array of vehicles
		Vehicle[] fleet = new Vehicle[5];
		fleet[0] = new Car(65, 3, 12);
		fleet[1] = new Truck(45, 1.5);
		fleet[2] = new Car(85, 4, 18);
		fleet[3] = new Motorcycle(120, 450);
		fleet[4] = new Car(45, 5, 16);

		// Iterate and display
		for (Vehicle v : fleet) {
			display(v);
			System.out.println("#@! - " + v);
		}
	}
}
