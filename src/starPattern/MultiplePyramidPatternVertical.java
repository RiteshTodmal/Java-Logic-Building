package starPattern;

import java.util.Scanner;

public class MultiplePyramidPatternVertical {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines you want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		for(int r=1; r<=lines; r++) {

			for(int s=lines; s>r; s--){
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print(" ");
			}
			
			
			
			System.out.println();
		}
		
		for(int r=1; r<=lines; r++) {

			for(int s=lines; s>r; s--){
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++) {
				System.out.print("* ");
			}
			
			for(int s=1; s<=lines-r; s++) {
				System.out.print(" ");
			}
			
			
			System.out.println();
		}
		
		
		
		
		
	}

}
