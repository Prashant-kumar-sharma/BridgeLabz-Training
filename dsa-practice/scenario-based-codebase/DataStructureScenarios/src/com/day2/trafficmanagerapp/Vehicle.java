package com.day2.trafficmanagerapp;

class Vehicle {
	String numberPlate;
	Vehicle next;

	Vehicle(String numberPlate) {
		this.numberPlate = numberPlate;
		this.next = null;
	}
}