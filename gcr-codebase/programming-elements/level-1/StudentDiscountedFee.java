// Writing a Java Code to find the discounted amount and discounted price the student will pay for the course.
public class StudentDiscountedFee {
	public static void main(String args[]) {
		//Create variable fee and discountPercent to store the fee and discount percent
		int fee = 125000, discountPercent = 10;
		
		//Creating variable discountedAmount and discountedFee to store discounted amount and final discounted fee
		int discountedAmount = discountPercent*fee/100;
		int discountedFee = fee - discountedAmount;
		
		//Print the Result
		System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + discountedFee);
	}
}
