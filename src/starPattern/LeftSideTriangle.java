package starPattern;

import java.util.Scanner;

public class LeftSideTriangle {
	public static void main(String[] args) {
		
		
		int lines;
		
		System.out.println("How Many Lines You Want : ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		for(int r = 1; r<=lines; r++) {
			
			for(int c = 1; c<=r; c++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
