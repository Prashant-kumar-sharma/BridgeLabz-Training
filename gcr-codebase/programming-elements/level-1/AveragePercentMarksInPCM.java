// Writing Java Code to take Sam's marks in Maths, Physics and Chemistry and calculate his average percent marks in PCM.
public class AveragePercentMarksInPCM {
	public static void main(String args[]) {
		//create variable mathsMarks, physicsMarks and chemistryMarks to store marks scored in maths, physics and chemistry.
		int mathsMarks = 94, physicsMarks = 95, chemistryMarks = 96;
		
		//Create a variable averagePercentMarks to calculate the average percent marks in PCM.  
		double averagePercentMarks = (mathsMarks + physicsMarks + chemistryMarks)/3.0;
		
		//Print the average percent mark
		System.out.println("Average Percent Marks in PCM is " + averagePercentMarks);
	}
}