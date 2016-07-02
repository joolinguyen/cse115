import java.util.*;
public class geometric_calculator {


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print ("What is the radius?");
		double radius = in.nextDouble();
		
		if (radius >= 0)
		{
			System.out.println("Area = " + (radius*radius*3.14));
			System.out.println("Perimeter = " + (2*3.14*radius));
			
		}
		else
			System.out.print("invalid input");

	}

}
