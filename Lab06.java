package Day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab06 {

	public static void main(String[] args) {
		int [][] coordinate = new int [8][3];
		point [] array = new point [8];
		
		for (int i = 0; i <coordinate.length; i++){
			for (int j = 0; j < coordinate[i].length; j++){	
					Random random = new Random();
					coordinate[i][j] = random.nextInt(30)-15;
					point point = new point(coordinate[i][0], coordinate[i][1], coordinate[i][2]);
					array[i] = point;
					String id = Integer.toString(i);
			}
		}
		int index = 0;
		for (int [] a : coordinate){
			System.out.println("ID " + String.valueOf(index++) + ": " + Arrays.toString(a));
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 points' IDs (as an integer) to get distance between them: ");
		System.out.print("Point 1 ID: ");
		int id1 = in.nextInt();
		while (id1 > 7 || id1 < 0){
			System.out.print("Invalid input. Try a different point ID: ");
			id1 = in.nextInt();
		}
		
		System.out.print("Point 2 ID: ");
		int id2 = in.nextInt();
		while (id2 > 7 || id2 < 0){
			System.out.print("Invalid input. Try a different point ID: ");
			id2 = in.nextInt();
		}		
		
		int dx = array[id1].getX() - array[id2].getX();
		int dy = array[id1].getY() - array[id2].getY();
		int dz = array[id1].getZ() - array[id2].getZ();
		
		System.out.println("Distance is: " + getDistance(dx, dy, dz));
	}
	
	public static double getDistance(int dx,int dy, int dz){
		return (Math.sqrt(dx * dx + dy * dy + dz * dz));
	}
}
