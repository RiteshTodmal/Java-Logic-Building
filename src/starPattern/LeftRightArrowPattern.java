package starPattern;

import java.util.Scanner;

public class LeftRightArrowPattern {
	
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("How Many Lines You Want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		System.out.println("Left Arrow Pattern : ");
		
		for(int r = 1 ; r<=lines; r++) {
			
			for(int s =1 ; s<r; s++) {
				System.out.print("   ");
			}
			
			for(int c =1; c<=r; c++) {
				System.out.print(" * ");
			}
			
			for(int s = 1; s<=(lines-r)*2; s++) {
				System.out.print("   ");
			}
			
			System.out.println();
			
		}
		
		
		for(int r =1 ; r<=lines-1; r++) {
			
			for(int s =1; s<=lines-1-r; s++) {
				System.out.print("   ");
			}
			
			
			for(int c =1; c<= lines-r; c++) {
				System.out.print(" * ");
			}
			
			
			for(int s = 1; s<=(r*2); s++) {
				System.out.print("   ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Right Arrow Pattern : ");
		
		for(int r = 1 ; r<=lines; r++) {
			
			for(int s = 1; s<=(lines-r)*2; s++) {
				System.out.print("   ");
			}
			
			for(int c =1; c<=r; c++) {
				System.out.print(" * ");
			}
			
			for(int s =1 ; s<r; s++) {
				System.out.print("   ");
			}
			
			System.out.println();
			
		}
		
		
		for(int r =1 ; r<=lines-1; r++) {
			
			for(int s = 1; s<=(r*2); s++) {
				System.out.print("   ");
			}

			
			
			for(int c =1; c<= lines-r; c++) {
				System.out.print(" * ");
			}
			
		
			
			for(int s =1; s<=lines-1-r; s++) {
				System.out.print("   ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
