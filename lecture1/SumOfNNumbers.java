package lecture1;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter you number");
		 int n = sc.nextInt();
		 int sum = 0;
		 int i = 1;
		 while(i<=n) {
			 
			 sum = sum + i;
			 i = i + 1;
			 
		 }
		 System.out.println(sum);
		 

	}

}
