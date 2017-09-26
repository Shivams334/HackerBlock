package lecture1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		int num = sc.nextInt();
		int orow = 1;
		int row = orow;
		int col;
		int counter;
		while(orow<=2*num-1) {
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
			
			if(orow<num){
				row = row + 1;
			}
			else {
				row = row -1;
			}
			orow = orow + 1;
			System.out.println("\n");
	

	}

	}
}
