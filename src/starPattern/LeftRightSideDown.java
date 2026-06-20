package starPattern;

import java.util.*;

public class LeftRightSideDown {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the lines you Want: ");
		Scanner sc= new Scanner(System.in);
		lines = sc.nextInt();
		
		System.out.println();
		
		for(int r =1; r<=lines; r++) {
			
			for(int c=lines; c>=r; c--) {
				System.out.print(" * ");
			}
			
			for(int s = 1 ; s<r; s++) {
				System.out.print("   ");
			}
			
			for(int s = 1 ; s<r; s++) {
				System.out.print("   ");
			}
			
			for(int c=lines; c>=r; c--) {
				System.out.print(" * ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
