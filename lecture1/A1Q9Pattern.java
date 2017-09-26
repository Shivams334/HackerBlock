package lecture1;

import java.util.Scanner;

public class A1Q9Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		int num = sc.nextInt();
		int row = 0;
		
		
		while(row <= num) {
			int counter = 1; 
			int col = 0;
			
			while(col <= row) {
				System.out.print(counter + " ");
				col = col + 1;
				counter= (counter*(row - col + 1))/col;
				
			}
			
			
			System.out.println();
			row = row + 1;
		
		}

	}

}
