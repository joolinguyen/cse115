package examples;
import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch (int[] array, int left, int right, int target){
		
		int middle = (left + right)/2;
		
		if (target == array[middle]){
			return middle;
		}
		if (target < array[middle]){
			return binarySearch(array, left, middle-1, target);
		}
		return binarySearch(array, middle + 1, right, target);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		 System.out.println("Enter number of elements");
		 int n = input.nextInt(); 
		 //validate number of elements
		 while (n<=0){
			 System.out.print("Invalid input. Enter a positive number of elements: ");
			 n = input.nextInt();
		 }
		 //initiate array
		 int[] array = new int[n];
		 
		 for (int i=0; i<n; i++){
		    System.out.print("Enter integer #" + (i+1));
		    array[i] = input.nextInt();
		 }
		 //print array
		 System.out.print("The array is: ");
		 for (int i=0; i<n;i++){
			 System.out.print(" " + array [i]);
		 }
		 System.out.println();
		 
		 System.out.println("Enter the value to search: ");
		 int target = input.nextInt();
		 
		 //validate if target is in array
		 int counter = 0;
		 for (int j=0; j<n; j++){
			 if (target == array[j]){
				 counter++;
			 }
		 }
		 if (counter==0){
			 System.out.println("number not found in array");
		 }
		 else{
			 System.out.println("The array index found is " + binarySearch(array,0,n-1,target));
			 
		 }
	}
}
