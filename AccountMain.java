package Day5;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
				
			System.out.println("please provide the information below");
			System.out.println();
			
			System.out.print("Enter Bank's Name: ");
			String bankName = in.nextLine();
			
			System.out.print("Enter Customer's Name: ");
			String custName = in.nextLine();
			
			System.out.print("Enter monthly interest rate: ");
			double ir = in.nextDouble();
			while (ir < 0){
				System.out.print("Interest rate can't be negative. Try again: ");
				ir = in.nextDouble();
			}
			
			System.out.println();
			
			double amount = 0;
			String date = "july";
			
			//savings account 1
			SavingsAccount saving1 = new SavingsAccount(bankName, custName, amount, date);
			
			saving1.setPeriod(1);
			saving1.setInterestRate(ir);
			
			//make 2 deposits
			saving1.deposit(1000);
			saving1.deposit(500);
			//make 3 interest calculations
			saving1.calculateInterest();
			saving1.calculateInterest();
			saving1.calculateInterest();
			
			//print statement
			System.out.println("Savings Account 1: ");
			saving1.printStatement();
			System.out.println();	
			
			//savings account 2
			SavingsAccount saving2 = new SavingsAccount(bankName, custName, amount, date);
			
			saving2.setPeriod(1);
			saving2.setInterestRate(ir);
			
			//make 1 deposits
			saving2.deposit(900);
			
			//make 2 withdrawals, one is unprotected overdraft
			saving2.withdraw(500);
			saving2.withdraw(800);
			
			//print first statement
			System.out.println("Savings Account 2:");
			System.out.println();
			saving2.printStatement();
			
			//make 2 interest calculation
			saving2.calculateInterest();
			saving2.calculateInterest();
			
			//print second statement
			System.out.println();
			saving2.setDate("August");
			saving2.printStatement();
			
			//checking account 1
			CheckingAccount checking1 = new CheckingAccount(bankName, custName, amount, date);
			
			//make 3 deposits
			checking1.deposit(500);
			checking1.deposit(200);
			checking1.deposit(1300);
			
			//make 3 withdrawals;
			checking1.withdraw(200);
			checking1.withdraw(300);
			checking1.withdraw(100);
			
			//print statement
			System.out.println("Checking Account 1: ");
			System.out.println();
			checking1.printStatement();
			
			//checking account 2
			CheckingAccount checking2 = new CheckingAccount(bankName, custName, amount, date);
			
			//make 2 deposits
			checking2.deposit(700);
			checking2.deposit(800);
			
			//print first monthly statement
			System.out.println("Checking Account 2: ");
			System.out.println();
			checking2.printStatement();
			
			//make 1 unprotected overdraft
			checking2.withdraw(3000);
			
			//make 1 protected overdraft
			checking2.setOdProtect(true);
			checking2.withdraw(3000);
			
			//print second statement
			System.out.println();
			checking2.setDate("august");
			checking2.printStatement();
			}
}

	


