package com.day6.tourmate;

public class Transport {

	private double cost;

	public Transport(int choice, boolean international) {
		if (international) {
			cost = (choice == 1) ? 45000 : 30000; // Flight / Cruise
		} else {
			cost = (choice == 1) ? 8000 : 4000; // Flight / Train
		}
	}

	double getCost() {
		return cost;
	}
}
