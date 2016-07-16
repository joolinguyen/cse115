package Day4;
import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		
		Stock oracle = new Stock ("OCL", "Oracle Corporation");
		oracle.setPreviousClosingPrice(34.5);
		
		Stock microsoft = new Stock ("MSF", "Microsoft Corporation");
		microsoft.setPreviousClosingPrice(55.8);
		
		String[] weekdays = {"monday","tuesday","wednesday","thursday","friday"};
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++){
			
			System.out.println(weekdays[i]);
			
			System.out.print("Enter closing price for OCL today: ");
			double OclosingPrice = in.nextDouble();
			while (OclosingPrice < 0){
				System.out.println("Closing price can't be negative. Try again: ");
				OclosingPrice = in.nextDouble();
			}
			oracle.setClosingPrice(OclosingPrice);
			
			System.out.print("Enter closing price for MSF today: ");
			double MclosingPrice = in.nextDouble();
			while (MclosingPrice < 0){
				System.out.println("Closing price can't be negative. Try again: ");
				MclosingPrice = in.nextDouble();
			}
			microsoft.setClosingPrice(MclosingPrice);
			
			System.out.println(oracle.getSymbol() + " " + oracle.getPrevClosingPrice() + " " + oracle.getClosingPrice() + " " + oracle.getChangePercent() + "%");
			System.out.println(microsoft.getSymbol() + " " + microsoft.getPrevClosingPrice() + " " + microsoft.getClosingPrice() + " " + microsoft.getChangePercent() + "%" );
			System.out.println();
			
			oracle.setPreviousClosingPrice(OclosingPrice);
			microsoft.setPreviousClosingPrice(MclosingPrice);
		}
	}

}
