// Writing a Java Code to divide pens among students equally
public class PenDistribution {
	public static void main(String args[]) {
		//Create variable totalPens and students to store total no. of pens and no. of students
		int totalPens = 14, students = 3;
		
		//Creating variable penPerStudent and nonDistributedPens to store pens per students and no. of non-distribured pens
		int penPerStudent = (int) totalPens/students;
		int nonDistributedPens= totalPens%students;
		
		//Print the Result
		System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + nonDistributedPens);
	}
}
