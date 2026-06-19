package starPattern;

import java.util.Scanner;

public class RightSideTriangle {
	public static void main(String[] args) throws Exception {
		
		int lines;
		 System.out.println("How Many Lines Do You Want : ");
		 Scanner sc = new Scanner(System.in);
		 lines = sc.nextInt();
		 
		 
		 
		 System.out.println("Left Side Triangle");
		 
		 
		 for(int r = 1; r<=lines; r++) {
			 
			 //star printing
			 for(int c = 1; c <= r; c++) {
				 System.out.print(" * ");
				 Thread.sleep(500);
			 }
			 
			 //space printing
			 for(int s = 1; s<= lines - r; s++) {
				 System.out.print("   ");
				 Thread.sleep(500); 
			 }
			 
			 System.out.println();
		 }
		 
		 
		 System.out.println("Right Side Traingle");
		 
for(int r = 1; r<=lines; r++) {
	
	
			//space printing
			 for(int s = 1; s<= lines - r; s++) {
				 System.out.print("   ");
				 Thread.sleep(500); 
			 }
			 
			 //star printing
			 for(int c = 1; c <= r; c++) {
				 System.out.print(" * ");
				 Thread.sleep(500);
			 }
			 
			 
			 
			 System.out.println();
		 }
		 
		
		
		
	}

}
