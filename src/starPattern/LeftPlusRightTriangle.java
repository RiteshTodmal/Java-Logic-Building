package starPattern;

import java.util.Scanner;

public class LeftPlusRightTriangle {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter lines you want : ");
		Scanner sc= new Scanner(System.in);
		lines = sc.nextInt();
		
		for(int r =1;r<=lines; r++) {
			
			for(int c =0; c<r; c++) {
				System.out.print(" * ");
			}
			
			for(int s =1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			for(int s =1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			for(int c =0; c<r; c++) {
				System.out.print(" * ");
			}
			
			
			
			
			
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}
