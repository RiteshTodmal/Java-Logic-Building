package starPattern;

import java.util.Scanner;

public class IsoscelesDownTRiangle {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		for(int r=1; r<=lines; r++) {
			
			
			for(int s=1; s<r; s++) {
				System.out.print(" ");
			}
			
			for(int c=lines*2-1; c>=r*2-1; c--) {
				System.out.print("*");
			}
			
			for(int s=1; s<r; s++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
