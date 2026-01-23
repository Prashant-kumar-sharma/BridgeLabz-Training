/*
 10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory
*/

package com.day9.medwarehouse;

public class MedWarehouseApp {
	public static void main(String[] args) {
		MedWarehouseManager warehouse = new MedWarehouseManager();
		// Branch A - already sorted by expiry (earliest first)
		Medicine[] branchA = {
		    new Medicine("Paracetamol 650mg", "PCM-650A", "2026-01-20", "North"),
		    new Medicine("Amoxicillin 500mg", "AMX-500N", "2026-03-18", "North"),
		    new Medicine("Levocetirizine 5mg", "LCT-305N", "2026-06-02", "North"),
		    new Medicine("Diclofenac 50mg", "DCF-110N", "2026-07-22", "North")
		};

		// Branch B – already sorted
		Medicine[] branchB = {
		    new Medicine("Pantoprazole 40mg", "PAN-402S", "2026-01-28", "South"),
		    new Medicine("Metformin XR 500mg", "MET-XR5S", "2026-04-08", "South"),
		    new Medicine("Losartan 50mg", "LOS-509S", "2026-06-25", "South")
		};

		// Branch C – already sorted
		Medicine[] branchC = {
		    new Medicine("Azithromycin 250mg", "AZI-250E", "2026-02-22", "East"),
		    new Medicine("Vitamin D3 60K IU", "VD3-60KE", "2026-03-30", "East"),
		    new Medicine("Ciprofloxacin 250mg", "CIP-250E", "2026-08-18", "East")
		};


		System.out.println("Merging expiry-sorted lists from all branches...\n");

		// Merge pairwise
		Medicine[] mergedAB = warehouse.merge(branchA, branchB);
		Medicine[] allMedicines = warehouse.merge(mergedAB, branchC);

		// Show complete sorted inventory
		System.out.println("Complete Warehouse Inventory (sorted by expiry):");
		warehouse.showInventory(allMedicines);

		// Show urgent items
		warehouse.showExpiringSoon(allMedicines);

		System.out.println("\nAction required: Prioritize dispatch/return of items shown in alert.");
	}
}