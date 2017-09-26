package lecture1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		int num = sc.nextInt();
		int row = 1;
		int col;
		int counter;
		while(row<num) {
			col = 1;
			while(col<=num-row) {
				
				System.out.print(" ");
				col = col + 1;
			}
			counter = 1;
			col = 1;
			while(col<=row) {
				System.out.print(counter);
				col = col + 1;
				counter = counter + 1;
			}
			counter = counter - 2;
			col = 1;
			while(col<=row-1) {
				System.out.print(counter);
				counter = counter - 1;
				col = col + 1;
				
			}
			System.out.println("\n");
			row = row + 1;
		}
		
		
	}

}
