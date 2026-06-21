package starPattern;

import java.util.Scanner;

public class HollowPyramidPattern {
	public static void main(String[] args) {
		
		int lines;
		
		System.out.print("Enter the number of lines you want: ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		for(int r =1; r<=lines; r++) {
			
			for(int s = lines -r; s>0; s--) {
				System.out.print(" ");
			}
			
			for(int c=1; c<=r; c++) {
				if(r==1 || r==lines) {
					System.out.print("* ");
				}
				else {
					if(c==1 || c == r) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
		
		
		
	}

}
