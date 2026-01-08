package com.day6.tourmate;

public class DomesticTrip extends Trip {

	public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
		super(destination, duration, transport, hotel, activity);
	}

	@Override
	public void book() {
		System.out.println("Domestic trip booked to " + destination);
		System.out.println("Total Budget: Rs. " + totalBudget);
	}

	@Override
	public void cancel() {
		System.out.println("Domestic trip to " + destination + " cancelled.");
	}
}
