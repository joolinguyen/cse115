package Day2;

import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		System.out.println("Payroll");
		System.out.println("");
		
		Scanner info = new Scanner(System.in);
		
		System.out.print("Enter company name: ");
		String company_name = info.nextLine();
	
		System.out.print("Enter number of employees: ");
		int emp_number = info.nextInt();
		
		while (emp_number < 0){
			System.out.print("Invalid input. Enter a positive number: ");
			emp_number = info.nextInt();
		}
		
		Scanner time = new Scanner(System.in);
		System.out.print("Enter the date today: ");
		String date = time.nextLine();
		
		for (int i=1; i <= emp_number; i++){
			
			Scanner emp = new Scanner(System.in);
			System.out.print("Enter employee "+ i + " name:");
			String name = emp.next();
			
			System.out.print("How much does this employee make per hour? ($): ");
			double pay = emp.nextDouble();
			
			while(pay < 0 || pay > 75.00){
				System.out.print("Pay rate must be between 0 and 75.00. Try again: ");
				pay = emp.nextDouble();
			}
			
			System.out.print("Enter number of hours worked: ");
			double hour = emp.nextDouble();
			
			while (hour < 0 || hour > 72){
				System.out.print("Hours worked must be between 0 and 72.00. Try again: ");
				hour = emp.nextDouble();
			}
			
			double paycheck = pay * hour;
			
			System.out.println("Company: " + company_name);
			System.out.println("Date: " + date);
			System.out.println("Employee: " + name);
			System.out.println("Paycheck amount: " + paycheck);
			System.out.println();
			System.out.println();
		}
	}
}
