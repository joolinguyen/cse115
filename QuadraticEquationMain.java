package Day4;
import java.util.Scanner;

public class QuadraticEquationMain {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		while (a == 0){
			System.out.print("a can't be 0. Try again: ");
			a = input.nextDouble();
		}
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		
		if (equation.getDiscriminant() < 0){
			System.out.println("Roots are imaginary.");
		}
		else if (equation.getDiscriminant() == 0){
			System.out.println("Roots are equal and is equal to " + equation.getRoot1());
		}
		else {
			System.out.println("There are two roots: ");
			System.out.println("Root 1 = " + equation.getRoot1());
			System.out.println("Root2 = " + equation.getRoot2());
		}
	}
}
