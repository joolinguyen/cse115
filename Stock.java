package Day4;

public class Stock {
	
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double closingPrice;
	
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return  name;
	}
	public double getPrevClosingPrice(){
		return previousClosingPrice;
	}
	public double getClosingPrice(){
		return closingPrice;
	}
	
	public void setPreviousClosingPrice(double previousClosingPrice){
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public void setClosingPrice(double closingPrice){
		this.closingPrice = closingPrice;
	}
	public Stock (String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public double getChangePercent(){
		return ((closingPrice - previousClosingPrice)/previousClosingPrice) * 100;  
	}
	
}
