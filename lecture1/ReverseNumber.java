package lecture1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("PLease enter your number");
		int num = sc.nextInt();
		int revno = 0;
		int rem;
		while(num>0) {
			rem = num % 10;
			revno = revno*10 + rem;
			num= num/10;
			
		}
		System.out.println(revno);

	}

}
