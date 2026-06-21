package starPattern;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the lines you want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		for(int r=1; r<=lines; r++) {
			
			
			for(int s=lines; s>r; s--) {
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int r=1;r<lines; r++) {
			
			for(int s=1; s<=r; s++) {
				System.out.print(" ");
			}
			
			for(int c=lines; c>r; c--) {
				System.out.print("* ");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
	}
	
	

}
