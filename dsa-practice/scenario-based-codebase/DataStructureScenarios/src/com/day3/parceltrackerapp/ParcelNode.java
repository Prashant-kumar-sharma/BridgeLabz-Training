package com.day3.parceltrackerapp;

class ParcelNode {
	String stage;
	ParcelNode next;

	public ParcelNode(String stage) {
		this.stage = stage;
		this.next = null;
	}
}
