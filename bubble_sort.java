package examples;
import java.util.Scanner;

public class bubble_sort {
	
	public static void bubblesort( int a[], int n ){
		int i,j,t=0;
		for (i=0; i<n; i++){
			for (j=1; j<(n-i); j++){
				if (a[j-1] > a[j]){
					t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}	
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many elements are there in the array to sort? ");
		int n = input.nextInt();
		
		int k, m, t;
		int[] array = new int[n];
		for (k=1; k <= n; k++){
			System.out.print("Enter element number " + k + ":" );
			array[k-1] = input.nextInt();
		}
		System.out.print("Array before sorting: ");
		for (m=0; m < n; m++){
			System.out.print(" " + array[m]);
		}
		
		System.out.println();
		
		bubblesort(array,n);
		
		System.out.print("Array after sorting: ");
		for (t=0; t < n; t++){
			System.out.print(" " + array[t]);
		}
	}

}
