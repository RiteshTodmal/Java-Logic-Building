package numberPattern;

import java.util.Scanner;

public class RightSideNumberPattern {
	public static void main(String[] args) {
		int lines;
		
		System.out.print("Enter Number of lines: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		for(int r=1; r<=lines; r++) {
			
			for(int s=lines; s>r; s--) {
				System.out.print(" ");
			}
			
			for(int c=r; c>=1; c--) {
				System.out.print(c);
			}
			
			System.out.println();
		}
		
		
	}

}
