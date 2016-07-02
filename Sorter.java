import java.util.*;
public class Sorter {


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter first number");
		double num1 = in.nextDouble();
		
		System.out.print("Enter second number");
		double num2 = in.nextDouble();
		
		System.out.print("Enter third number");
		double num3 = in.nextDouble();
		
		double max, mid, min;
		
		if (num1 > num2 && num1 > num3)
		{
			 max = num1;
				if (num2 > num3) 
				{
					 min = num3;  mid = num2;
				}else {  min = num2;  mid = num3;}
				
			
		}else if (num2 > num1 && num2 > num3)
		{
			 max = num2;
				if (num1 > num3) 
				{  min = num3;
				 mid = num1;}
				else {  min = num1;
				 mid = num3;}
		}else 
		{
			max = num3;
				if (num1>num2)
				{ min = num2; 
				mid = num1;}
				else { min = num1;
				mid = num2;}
		}
		System.out.println(max);
		System.out.println(mid);
		System.out.println(min);
		
}
}
