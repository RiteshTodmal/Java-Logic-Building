package starPattern;

import java.util.Scanner;

public class HollowBox {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.println("How Many Lines Do You Want : ");
		Scanner sc = new Scanner(System.in);
		
		lines = sc.nextInt();
		
		
		for(int r=1; r<= lines; r++) {
			
			for(int c = 1; c<=lines; c++) {
				
				if(r==1 || r==lines) {
					System.out.print(" * ");
				}
				else {
					
					if(c==1 || c == lines) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}
				}
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
