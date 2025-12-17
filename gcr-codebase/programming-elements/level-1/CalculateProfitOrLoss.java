// Writing a Java Code to take cost price and selling price and calculate the profit and loss in number and percentage
public class CalculateProfitOrLoss {
	public static void main(String args[]) {
		//Create variable costPrice and sellingPrice to store cost price and selling price
		int  costPrice = 129, sellingPrice = 191;
		
		//Creating variable profit and profitPercentage to store calculated profit and profit percentage.
		int profit = sellingPrice - costPrice;
		double profitPercentage = (double)profit/costPrice*100.0;
		
		//Print the Result
		System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}
