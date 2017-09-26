package lecture1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = sc.nextInt();
		int fn = 0;
		int sn = 1;
		int sum = 0;
		int  counter = 2;
		if(n==2) {
			System.out.print("0 1");
		}
		else if(n==1) {
			System.out.print("0");
		}
		else if(n>=2) {
			System.out.print("0 1");
		}
		while(counter<n) {
			sum = fn + sn;
			fn = sn;
			sn = sum;
			System.out.print(" "+sum);
			counter = counter + 1;
			
		}
	

	}

}
