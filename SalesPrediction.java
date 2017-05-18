/*
Programmer: Justin Doggett
Date: 5/3/2017
Description: A company generates 62% of total sales. This program predicts how much a company division will generate if the company has $4.6 million in sales this year.
*/
public class SalesPrediction
{
	
	public static void main(String [] args)
	{
		double percent = 0.62; //stores the value 0.62 in a double variable named percent.
		double sales = 4600000; //stores the value of 4600000 in a double variable named sales.
		double generateFromSales = percent * sales; //stores the calculated value of percent * sales in a double variable named generateFromSales.

		//displays how much the company will generate to the console
		System.out.println("The company will generate " + generateFromSales + " dollars this year.");
	}
}
