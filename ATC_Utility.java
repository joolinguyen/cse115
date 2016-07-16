package Day6;
import java.util.Scanner;

public class ATC_Utility {

	public static void main(String[] args) {
		
		//initialize array
		int [][][] ac = new int [4][12][3];
		
		//generate random lat and long values
		for (int i = 0; i < ac.length; i++){
			for (int j = 0; j < ac[i].length; j++){
				for (int k = 0; k < 2; k++){
					ac [i][j][k] = 1 + (int)(Math.random() * 128);
				}
			}
		}
		
		//generate random altitude values
		int k = 2;
		for (int i = 0; i < ac.length; i++){
			for (int j = 0; j < ac[i].length; j++){
				ac [i][j][k] = 1 + (int)(Math.random()*350);
			}
		}
		
		//prompt user to enter sector number
		Scanner in = new Scanner (System.in);
		System.out.print("Enter sector number (1-4): ");
		int sector = in.nextInt() - 1;
		//validate input
		while (sector < 0 || sector > 3){
			System.out.println("Invalid sector number. Enter an integer between 1 and 4: ");
			sector = in.nextInt();
		}
		
		for (int i = 0; i < ac[sector].length; i++){
			
			//set default values to out of range maximum
			double shortestDistance1 = 300, shortestDistance2 = 300, shortestDistance3 = 300;
			int lat1 = 300, long1 = 300, alt1=400, ac1 = 1;
			int lat2 = 300, long2 = 300, alt2=400, ac2 = 1;
			int lat3 = 300, long3 = 300, alt3=400, ac3 = 1;
			
			//calculate distance between current AC and every AC with index less than itself
			for (int j = 0; j < i; j++){
				double distance = distance(ac[sector][i][0], ac[sector][i][1],ac[sector][i][2], ac[sector][j][0], ac[sector][j][1], ac[sector][j][2]);
				//update shortest distance if applicable
				if (shortestDistance1 > distance){
					
					shortestDistance3 = shortestDistance2;
					lat3 = lat2; long3 = long2; alt3 = alt2; ac3 = ac2;
					
					shortestDistance2 = shortestDistance1; 
					lat2 = lat1; long2 = long1; alt2 = alt1; ac2 = ac1;
					
					shortestDistance1 = distance;
					lat1 = ac[sector][j][0]; long1 = ac[sector][j][1]; alt1 = ac[sector][j][2]; ac1 = j;
				}
				
				else if (shortestDistance2 > distance){
					shortestDistance3 = shortestDistance2;
					lat3 = lat2; long3 = long2; alt3 = alt2; ac3 = ac2;
					
					shortestDistance2 = distance;
					lat2 = ac[sector][j][0]; long2 = ac[sector][j][1]; alt2 = ac[sector][j][2]; ac2 = j;
				}
				else if ((shortestDistance2 <= distance) && (shortestDistance3 > distance)){
					shortestDistance3 = distance;
					lat3 = ac[sector][j][0]; long3 = ac[sector][j][1]; alt3 = ac[sector][j][2]; ac3 = j;
				}
			}
			
			//calculate distance between current AC and every AC with index larger than itself
			for (int j = i+1;j < ac[sector].length; j++){
				double distance = distance(ac[sector][i][0], ac[sector][i][1],ac[sector][i][2], ac[sector][j][0], ac[sector][j][1], ac[sector][j][2]);
				//update shortest distance if applicable
				if (shortestDistance1 > distance){
					
					shortestDistance3 = shortestDistance2;
					lat3 = lat2; long3 = long2; alt3 = alt2; ac3 = ac2;
					
					shortestDistance2 = shortestDistance1; 
					lat2 = lat1; long2 = long1; alt2 = alt1; ac2 = ac1;
					
					shortestDistance1 = distance;
					lat1 = ac[sector][j][0]; long1 = ac[sector][j][1]; alt1 = ac[sector][j][2]; ac1 = j;
				}
				
				else if (shortestDistance2 > distance){
					shortestDistance3 = shortestDistance2;
					lat3 = lat2; long3 = long2; alt3 = alt2; ac3 = ac2;
					
					shortestDistance2 = distance;
					lat2 = ac[sector][j][0]; long2 = ac[sector][j][1]; alt2 = ac[sector][j][2]; ac2 = j;
				}
				else if ((shortestDistance2 <= distance) && (shortestDistance3 > distance)){
					shortestDistance3 = distance;
					lat3 = ac[sector][j][0]; long3 = ac[sector][j][1]; alt3 = ac[sector][j][2]; ac3 = j;
				}
			}
			//Display result
			System.out.println("AC-" + i +"     " + "Lat - " + ac[sector][i][0] + "  " + "Long - " + ac[sector][i][1] + "  " + "Alt - " + ac[sector][i][2]);
			System.out.println("Near01: " + "AC - " + ac1 + "  " + "Lat - " + lat1 + "  " + "Long - " + long1 + "  " + "Alt - " + alt1 + "  " + "Distance = " + shortestDistance1);
			System.out.println("Near02: " + "AC - " + ac2 + "  " + "Lat - " + lat2 + "  " + "Long - " + long2 + "  " + "Alt - " + alt2 + "  " + "Distance = " + shortestDistance2);
			System.out.println("Near03: " + "AC - " + ac3 + "  " + "Lat - " + lat3 + "  " + "Long - " + long3 + "  " + "Alt - " + alt3 + "  " + "Distance = " + shortestDistance3);
			System.out.println();
		}
	}
	
	//method to calculate distance
	public static double distance(int x1, int y1, int z1, int x2, int y2, int z2){
		return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) + (z2-z1) * (z2-z1));
	}
}
