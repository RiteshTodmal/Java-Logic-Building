package starPattern;

import java.util.Scanner;

public class LeftRightHallowTriangle {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("How Many Line You Want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		System.out.println("Left Side Hollow Pattern Printing");
		
		
		for(int r = 1; r<=lines ; r++) {
			
			// star printing
			for(int c = 1; c<=r; c++) {
				
				if( r == 1 || r == lines) {
					System.out.print(" * ");
				}
				else {
					
					if(c == 1 || c == r) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
				
			}
			
			// Space Printing
			for(int s =1 ; s<= lines - r; s++) {
				System.out.print("   ");
			}

			//Line
			System.out.println();
			
		}
		
		
		
		System.out.println("Right Side Hollow Pattern Printing");
		
		
		for(int r = 1; r<=lines ; r++) {
			
			
			
			// Space Printing
			for(int s =1 ; s<= lines - r; s++) {
				System.out.print("   ");
			}
			
			
			
			// star printing
							for(int c = 1; c<=r; c++) {
								
								if( r == 1 || r == lines) {
									System.out.print(" * ");
								}
								else {
									
									if(c == 1 || c == r) {
										System.out.print(" * ");
									}else {
										System.out.print("   ");
									}
								}
								
							}

			//Line
			System.out.println();
			
		}

		
	}

}
