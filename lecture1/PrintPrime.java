package lecture1;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your number");
		 int n = sc.nextInt();
		 int counter = 2;
		 while(counter<=n) {
			 
		 }
			 int i = 2;
			 while(i<counter) {
			 if(counter%i == 0) {
				 break;
				 
			 }
			 i = i + 1;
			 
		 }
			 if( i == counter) {
				 System.out.println("counter"+counter);
			 }
		 

	}

}
