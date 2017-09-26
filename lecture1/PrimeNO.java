package lecture1;

import java.util.Scanner;

public class PrimeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			System.out.println("please enter you number");
			int num = sc.nextInt();
			int i = 2;
			/*if(i > num) {
				System.out.println("prime");
				
			}
			else {
				if(num%2==0) {
					System.out.println("not prime");
				}
				else
				{
					i=i+1;
				}
			}*/
			while(i < num) {
				if(num%2==0) {
					System.out.println("not prime");
			}
				i = i + 1;
			
			
		

	}
			System.out.println("prime");
			}
	

}
