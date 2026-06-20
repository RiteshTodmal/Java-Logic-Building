package starPattern;

import java.util.Scanner;

public class HollowRhombusPattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines you want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		System.out.println("Left Side Hollow Rohmbus Pattern: ");
		
		for(int r=1; r<=lines; r++) {
			
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			for(int c=1; c<=lines; c++) {
				if(r==1 || r==lines) {
					System.out.print(" * ");
				}
				else {
					
					if(c==1 || c==lines) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			}
			
			
			for(int s=1; s<r; s++) {
				System.out.print("   ");
			}
			
			
			System.out.println();
		}
		
		
		
		System.out.println("Right Side Hollow Rohmbus Pattern: ");
		
		for(int r=1; r<=lines; r++) {
			
			
			for(int s=1; s<r; s++) {
				System.out.print("   ");
			}
			
			
			
			
			for(int c=1; c<=lines; c++) {
				if(r==1 || r==lines) {
					System.out.print(" * ");
				}
				else {
					
					if(c==1 || c==lines) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			}
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			
			
			
			
			System.out.println();
		}
		
		
	}

}
