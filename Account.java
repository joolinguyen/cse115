package Day5;

public class Account {
	protected String bankName, customerName,openingDate;
	protected int customerCreditScore;
	protected double balance;
	
	public Account ( String bankName, String date, int score, double loans){
		this.bankName = bankName;
		this.openingDate = date;
		this.customerCreditScore = score;
	}
	
	public Account (String bankName, String custName, String date){
		this.bankName = bankName;
		this.customerName = custName;
		this.openingDate = date;
	}
	
	public String getBankName(){
		return bankName;
	}
	
	public String getCustName(){
		return customerName;
	}
	
	public String getDate(){
		return openingDate;
	}
	
	public void setBankName(String name){
		bankName = name;
	}
	
	public void setCustName(String name){
		customerName = name;
	}
}	

//SavingsAccount subclass
class SavingsAccount extends Account{
	private double interestRate;
	private int compoundingPeriod;
	private java.util.ArrayList transactions = new java.util.ArrayList();

	public SavingsAccount( String bankName, String custName, double amt, String date){
		super(bankName, custName, date);
		this.balance = amt;
	}
	
	public void setDate(String date){
		this.openingDate = date;
	}
	public void setInterestRate(double rate){
		this.interestRate = rate;
	}
	
	public void setPeriod(int p){
		this.compoundingPeriod = p;
	}
	
	public void calculateInterest(){
		double interest;
		interest = (balance * Math.pow(1+interestRate, compoundingPeriod)) - balance;
		balance += interest;
		transactions.add(new Transaction('I', interest, balance,""));
	}
	
	public void withdraw(double amt){
		if(amt <= balance){
			balance = balance - amt;
			transactions.add(new Transaction('W', amt, balance,""));
		}
		else if (amt > balance){
			transactions.add(new Transaction('E', amt, balance,"Overdraft. Not processed."));
		}
	}
	
	public void deposit (double amt){
		balance = balance + amt;
		transactions.add(new Transaction('D', amt, balance,""));

	}
	 public java.util.ArrayList getTransactions() {
		    return transactions;
		  }
	
	public void printStatement(){
		
		System.out.println("Bank: " + bankName);
		System.out.println("Customer: " + customerName);
		System.out.println("Statement Date: " + openingDate);
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Type", "Amount", "Balance","Description");
			for (int i1 = 0; i1 < transactions.size(); i1++) {
			      Transaction transaction = (Transaction)(transactions.get(i1));
			      System.out.printf("%-15s%-15.1f%-15.1f%-15s\n", 
			          transaction.getType(), transaction.getAmount(), transaction.getBalance(), (transaction.getDescription()));
			}
		transactions.clear();
	}
}

class CheckingAccount extends Account{
	private boolean overdraftProtection = false;
	private double overdraftLimit;
	private boolean overdrawn = false;
	private java.util.ArrayList transactions = new java.util.ArrayList();

	public CheckingAccount(String bankName, String custName, double amt, String date){
		super (bankName, custName, date);
		this.balance = amt;
	}
	
	public void setDate(String date){
		this.openingDate = date;
	}
	
	public void setOdProtect(Boolean b){
		this.overdraftProtection = b;
	}
	
	public void setLimit(double lim){
		this.overdraftLimit = lim;
	}
	
	public void withdraw (double amt){
		
		if ((overdraftProtection == true) && (amt > balance)){
			balance = balance - amt;
			transactions.add(new Transaction('W', amt, balance,"protected overdraft"));

		}
		else if ( (overdraftProtection == false) && (amt > balance)){
			transactions.add(new Transaction('E', amt, balance,"unprotected overdraft. not processed"));
		}
		else {
			balance = balance - amt;
			transactions.add(new Transaction('W', amt, balance,""));
		}
	}
	
	public void deposit (double amt){
		balance = balance + amt;
		transactions.add(new Transaction('D', amt, balance,""));
	}
	 public java.util.ArrayList getTransactions() {
		    return transactions;
		  }
	
	public void printStatement(){
		System.out.println("Bank: " + bankName);
		System.out.println("Customer: " + customerName);
		System.out.println("Statement Date: " + openingDate);
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Type", "Amount", "Balance", "Description");
		for (int i1 = 0; i1 < transactions.size(); i1++) {
			Transaction transaction = (Transaction)(transactions.get(i1));
		    System.out.printf("%-15s%-15s%-15s%-15s\n",  
		    transaction.getType(), transaction.getAmount(), transaction.getBalance(), transaction.getDescription());
		}
		transactions.clear();
		System.out.println();
		
	}
	
	public boolean isOverdrawn(){
		boolean isOverdrawn;
		if (balance < 0){
			return isOverdrawn = true;
		}
		else{
			return isOverdrawn = false;
		}
	}
}

//transaction class to store transactions
class Transaction {
	  private char type;
	  private double amount;
	  private double balance;
	  private String description;
	  
	  public Transaction(char type, double amount, double balance, String description) {
	    this.type = type;
	    this.amount = amount;
	    this.balance = balance;
	    this.description = description;
	  }

	  public char getType() {
	    return type;
	  }

	  public double getAmount() {
	    return amount;
	  }
	  
	  public double getBalance() {
	    return balance;
	  }	  
	  
	  public String getDescription(){
		  return description;
	  }
}