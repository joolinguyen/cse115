package Day2;
import static javax.swing.JOptionPane.*;
public class compound_interest {
	
	public static void main(String[] args){
	int yesorno = 0;
	while(yesorno == 0){
		
		String startvalue = showInputDialog(null,"What is the present value?");
		double pv = Double.parseDouble(startvalue);
		while (pv < 0){
			startvalue = showInputDialog(null,"Invalid input. Enter a positive number.");
			pv = Double.parseDouble(startvalue);
		}
		
		String interest = showInputDialog(null,"What is the interest rate? ");
		double i = Double.parseDouble(interest);
		while (i < 0){
			interest = showInputDialog(null,"Invalid Input. Enter a positive number.");
			i = Double.parseDouble(interest);
		}
		
		String time = showInputDialog(null,"What is the number of years?");
		double n = Double.parseDouble(time);
		while (n < 0){
			time = showInputDialog(null,"Invalid Input.Enter a positive number.");
			n = Double.parseDouble(time);
		}
		
		//calculation
		double fv;
		fv = pv * Math.pow(1+i, n);
		
		showMessageDialog(null,"The future value is " + fv);
		
		
		 yesorno = showConfirmDialog(null,"Do you want to run again?");
		 
	}if (yesorno == 1 || yesorno == 2){
		showMessageDialog(null,"Good Bye :)");
	}
}
}
