package starPattern;

import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) throws Exception{
		
		System.out.print("How Many Lines Do You Want: ");
		
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		
		for(int r=1; r<=lines; r++) {
			for(int c =1; c<=lines; c++) {
				System.out.print(" * ");
				Thread.sleep(500);
				
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
