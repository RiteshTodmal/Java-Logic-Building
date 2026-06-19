package starPattern;

import java.util.Scanner;

public class LeftRigthDownTriangle {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.println("How Many Number Of Lines You Want : ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		// LeftSide Down Pattern
		System.out.println("LeftSide Down Pattern Printing");
		
		
		for(int r = 1; r<= lines; r++) {
			
			//star printing
			for(int c = lines; c>=r; c--) {
				System.out.print(" * ");
			}
			
			
			//space printing
			
			for(int s = 1; s<r; s++) {
				System.out.print("   ");
			}

			//line
			
			System.out.println();
		}
		
		
		
		// RightSide Down Pattern
				System.out.println("RightSide Down Pattern Printing");
				
				
				for(int r = 1; r<= lines; r++) {
					
					//space printing
					for(int s = 1; s<r; s++) {
						System.out.print("   ");
					}

					//star printing
					for(int c = lines; c>=r; c--) {
						System.out.print(" * ");
					}

					//line
					System.out.println();
				}
		
	}

}
