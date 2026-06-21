package numberPattern;

import java.util.Scanner;

public class LeftSideTrainglePattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter number of lines: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		for(int r=1; r<=lines; r++) {
			
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			
			System.out.println();
		}
		
		
		
	}

}
