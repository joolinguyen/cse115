import java.util.Scanner;

public class lottery {

	
	public static void main(String[] args) {
		
	    int lottery = 99 + (int)(Math.random() * 900); 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		String guess = input.next();
		
		while (guess.length() < 3 || (guess.length() > 4)){
			System.out.print("Invalid input. Please enter 3 digits number: ");
		    guess = input.next();
		}
		
		System.out.println("The lottery number is " + lottery);
		
		if (guess.length()==4){
			System.out.println("no matching digits");
		}else{
		
			String lotteryString = Integer.toString(lottery);
		
			int counter = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++){
					if (guess.charAt(i)==lotteryString.charAt(j)){
						counter++;
					}
				}
			}
		
			if (counter==3){
				System.out.println("All digits match. You win $99!");
			}else if (counter == 1 || counter == 2){
				System.out.println("One or two digits matched. You win 99 cents!");
			}else { 
				System.out.println("No matching digits");
			}
		}
	}
}
