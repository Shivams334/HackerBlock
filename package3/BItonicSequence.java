package package3;

import java.util.Scanner;

public class BItonicSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter  number");
		int num = sc.nextInt();
		System.out.println("please enter first number");
		int prev = sc.nextInt();
		int counter = 2;
		boolean dec = true;
		
		while(counter <= num) {
			System.out.println("please enter next number");
			int current = sc.nextInt();
			
			if(dec) {
				if(prev < current) {
					dec = false;
				}
				else
				{
					if(prev > current) {
						System.out.println("invalid");
					return;
					}
				}
				counter +=1;
				prev = current;
			}
		}
		
		System.out.println("valid");
		
		

	}

}
