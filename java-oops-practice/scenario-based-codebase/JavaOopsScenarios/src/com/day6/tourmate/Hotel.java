package com.day6.tourmate;

public class Hotel {

	private double costPerNight;
	private int nights;

	public Hotel(int type, int nights, boolean international) {
		this.nights = nights;

		if (international) {
			costPerNight = (type == 1) ? 9000 : 5000; // Luxury / Budget
		} else {
			costPerNight = (type == 1) ? 5000 : 2500;
		}
	}

	double getCost() {
		return costPerNight * nights;
	}
}
