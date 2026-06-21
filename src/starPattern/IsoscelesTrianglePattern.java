package starPattern;

import java.util.Scanner;

public class IsoscelesTrianglePattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the lines you want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		for(int r=1; r<=lines; r++) {
			
			for(int s=lines-r; s>=1; s--) {
				System.out.print(" ");
			}
			
			for(int c=1; c<=(r*2-1); c++) {
				System.out.print("*");
			}
			
			for(int s=lines-r; s>=1; s--) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}
