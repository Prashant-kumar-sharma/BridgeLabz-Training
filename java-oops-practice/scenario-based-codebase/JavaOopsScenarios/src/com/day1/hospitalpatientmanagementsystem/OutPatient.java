package com.day1.hospitalpatientmanagementsystem;

class OutPatient extends Patient {
	
	private int daysAdmitted;
	
    public OutPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age );
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println(" Out-Patient | For Consultation Only");
        System.out.println(" Discharged After : " + daysAdmitted + " days");
    }
}
