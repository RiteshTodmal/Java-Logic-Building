package starPattern;

import java.util.Scanner;

public class HollowDiamondPattern {
	public static void main(String[] args) {
		int lines;
		
		System.out.print("How Many Lines You Want : ");
		Scanner sc = new Scanner(System.in);
		lines = sc.nextInt();
		
		
		
		for(int r=1; r<=lines; r++) {
			
			
			for(int s=lines; s>r; s--) {
				System.out.print(" ");
			}
			
			for(int c =1; c<=r; c++) {
				if(c==1 || c==r) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		for(int r=1; r<lines; r++) {
			
			for(int s=1; s<=r; s++) {
				System.out.print(" ");
			}
			
			for(int c =lines-r; c>=1; c--) {
				if(r==lines-1) {
					System.out.print("* ");
				}else {
					if(c==lines-r || c==1) {
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
