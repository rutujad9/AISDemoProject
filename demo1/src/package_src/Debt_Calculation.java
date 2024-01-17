package package_src;
import java.util.Scanner;

public class Debt_Calculation 
{
    public static void main(String[] args) {
    	Scanner myObj  = new Scanner(System.in);
		System.out.println("Enter Debt Amount in Euros");    
		double debt_amount = myObj.nextDouble();
		System.out.println("Enter Interest Rate in Percentage");    
		double interest_rate = myObj.nextDouble();
		System.out.println("Enter Payback Duration in Months"); 
		int payback_duration = myObj.nextInt();
		double monthly_rate = 0.0;
		myObj.close();
		monthly_rate = monthly_amount(debt_amount, interest_rate);
		System.out.println("1. Monthly amount is "+monthly_rate+" Euros");
		System.out.println("2. Number of rates are "+payback_duration);
		System.out.println("3. Over all amount with interest is "+total_amount(debt_amount, interest_rate, payback_duration)+" Euros");
    }

    public static double monthly_amount(double debt_amount, double Interest_Rate)
	{
		double monthly_amount =0.0;
		monthly_amount= debt_amount * (Interest_Rate/12)*0.01; //Function to calculate Monthly_amount
		if(debt_amount < 0 || Interest_Rate < 0)
		{
			monthly_amount =0;
		}
		return monthly_amount;
	}
    
    public static double total_amount(double debt_amount, double Interest_Rate, int months)
	{
		double Total_amount = debt_amount + (debt_amount*(Interest_Rate/12)*months)/100; //Function to calculate Total amount
		if(Total_amount < 0)
		{
			return 0;
		}
		return Total_amount;
	}
}

