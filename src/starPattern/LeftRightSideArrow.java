package starPattern;

import java.util.Scanner;

public class LeftRightSideArrow {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("How Many Lines You Want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		System.out.println("LeftSide Arrow Pattern : ");
		
		for(int r = 1; r <= lines; r++) {
			
			// star printing
			for(int c = 1; c <= r; c++) {
				System.out.print(" * ");
			}
			
			//space printing
			for(int s = 1; s <= lines - r; s++) {
				System.out.print("   ");
			}
			
			//new line
			System.out.println();
			
		}
		
		
		for(int r = 1; r<=lines - 1; r++) {
			
			//star printing
			for(int c = 1; c<=lines-r; c++) {
				System.out.print(" * ");
			}
			
			
			//space printing
			for(int s = 1; s<=r; s++) {
				System.out.print("   ");
			}
			
			
			//new line
			System.out.println();
			
		}
		
		
		System.out.println("RightSide Arrow Pattern : ");
		
		for(int r = 1; r <= lines; r++) {
			
			
			
			//space printing
			for(int s = 1; s <= lines - r; s++) {
				System.out.print("   ");
			}
			
			// star printing
			for(int c = 1; c <= r; c++) {
				System.out.print(" * ");
			}
			
			//new line
			System.out.println();
			
		}
		
		
		for(int r = 1; r<=lines - 1; r++) {
		
			//space printing
			for(int s = 1; s<=r; s++) {
				System.out.print("   ");
			}
			
			//star printing
			for(int c = 1; c<=lines-r; c++) {
				System.out.print(" * ");
			}
			
			//new line
			System.out.println();
			
		}
		
		
		
	}

}
