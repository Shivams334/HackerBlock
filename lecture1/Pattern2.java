package lecture1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		int n = sc.nextInt();
		int row = 1;
		int col;
		int counter=1;
		while(row<=n) {
			col = 1;
			while(col<=row) {
				System.out.print(counter +" ");
				counter = counter + 1;
				col = col + 1;
				
			}
			row = row + 1;
			System.out.print("\n");
				
		}

	}

}
