package lecture1;

import java.util.Scanner;

public class LargestOfThreeNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int a = sc.nextInt();
		System.out.println("Please enter your second number");
		int b = sc.nextInt();
		System.out.println("Please enter your third number");
		int c = sc.nextInt();
		
		
		if(a>=b && a>=c) {
			System.out.println("greatest number is"+ a);
		}
		else if(b>=a && b>=c) {
			System.out.println("greatest number is"+ b);
			
		}
		else if(c>=a && b<=c) {
			System.out.println("greatest number is"+ c);
			
		}
		

	}

}
