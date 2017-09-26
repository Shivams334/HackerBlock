package lecture1;

import java.util.Scanner;

public class A2Q12Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		int num = sc.nextInt();
		int row = 1;
		int numstar = (num/2) + 1;
		int numsp = 1;
		
		
		while(row <= num){
			
			int col =1;
			while(col <= numstar){
			
				System.out.print("*\t");
				col +=1;
				
				
			}
			
			col = 1;
			
			while(col <= numsp) {
				System.out.print("\t");
				col += 1;
			}
			col = 1;
			while(col <= numstar) {
			
				System.out.print("*\t");
				col +=1;
				
				}
			
	             
			if(row <= (num/2)) {
				numstar -= 1;
				numsp += 2;
				
			}
			else
			{
				numstar += 1;
				numsp -= 2;
						
			}
			row = row + 1;
			System.out.println();

	}

   }
}
