package starPattern;

import java.util.Scanner;

public class DownHollowPyramidPattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		for(int r=1; r<=lines; r++) {
			
			for(int s =1; s<r; s++) {
				System.out.print(" ");
			}
			
			for(int c=lines; c>=r; c--) {
				if(r==1 || r==lines) {
					System.out.print("* ");
				}else {
					if(c==r || c==lines) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
