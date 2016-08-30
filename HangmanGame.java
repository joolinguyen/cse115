package Day9;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		
		//list of words
		String [] words = {"purple", "chubby", "pyjama", "pizzas", "jigsaw", "qwerty","faxing", "brazil", "hassle", "father", "mother", "grumpy"};
		
		char cont = 'y';
		while(cont == 'y'){
			
			int i = (int)(Math.random() * 12);
			String guessword = words [i];
			
			Scanner in = new Scanner(System.in);
			
			char [] characters  = { '*', '*','*','*','*','*'}; 
			System.out.println( characters );
			
			int correctLetters = 0;
			
			int missCounter = 0;
		
			while (correctLetters < guessword.length()){
				System.out.print("your guess: ");
				String guess = in.next();
				char letterGuessed = guess.charAt(0);
				
				//check for match
				int hit = 0;
				for (int j = 0; j < guessword.length(); j++){
					if (letterGuessed == guessword.charAt(j) ){
					characters[j] = letterGuessed;
					correctLetters ++;
					hit++;
					}
				}
				if (hit == 0){
					missCounter++;
				}
				System.out.println(characters);
			}	
				if (correctLetters == guessword.length()){
					System.out.print("Success! ");
					System.out.println("Number of misses: " + missCounter);
				}
				
				System.out.print("Another word? (y/n) ");
				String ans = in.next();
				cont = ans.charAt(0);
		}
	}
}
