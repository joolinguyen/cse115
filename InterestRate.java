package Day5;
import java.util.Scanner;

public class InterestRate {
	
	public static void main(String[] args ){
		Scanner in = new Scanner (System.in);
		
		String ans = "y";
		
		while (ans.equals("y")){
		
			//prompt user to input present value
			System.out.println("Present value must be between 0 and 100,000");
			double pv = validate (100000, 0.00);
			
			//prompt user to input interest rate
			System.out.println("Interest rate must be between 0 and .09");
			double ir = validate (0.09, 0.00);
			
			// prompt user to input time period
			System.out.print("Enter number of years: ");
			int yr = in.nextInt();
			
			//calculate future value and print result
			System.out.println("The future value is: " + calculate(pv, ir, yr));
			System.out.println();
			
			//ask if user want to re-run
			System.out.print("Do you want to run again? (y/n):  ");
			ans = in.next();
			System.out.println();
		}
	}

	private static double calculate ( double pv, double ir, int yr){
		double fv;
		fv = pv * Math.pow( 1+ir , yr);
		return fv;
	}
	
	private static double validate ( double upLim, double loLim){
		Scanner in = new Scanner (System.in);
		double value;
		
		//prompt for input
		System.out.print("Enter value: ");
		value = in.nextDouble();
		
		//validate
		while (value > upLim || value < loLim){
			System.out.print("Input is out of limit. Enter a different value: ");
			value = in.nextDouble();
		}
		System.out.println();
		return value;
	}
}
