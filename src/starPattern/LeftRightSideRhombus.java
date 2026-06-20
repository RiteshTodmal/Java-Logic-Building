package starPattern;

import java.util.Scanner;

public class LeftRightSideRhombus {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines You Want : ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		System.out.println("Left Side Rhombus Pattern : ");
		
		
		for(int r =1; r<=lines; r++) {
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			for(int c=1; c<=lines; c++) {
				System.out.print(" * ");
			}
			
			for(int s=1; s<r; s++) {
				System.out.print("   ");
			}
			
			System.out.println();
			
			
		}
		
		
		System.out.println();
		
		System.out.println("Right Side Rhombus Pattern : ");
		
		
		for(int r =1; r<=lines; r++) {
			
			for(int s=1; s<r; s++) {
				System.out.print("   ");
			}
			
			for(int c=1; c<=lines; c++) {
				System.out.print(" * ");
			}
			
			
			
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print("   ");
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

}
