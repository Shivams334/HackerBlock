package lcture4;

import java.util.Scanner;

public class FunWIthNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("please enter binary number");
	//	int bin = sc.nextInt();
		//int dec = b2d(bin);
		//System.out.println("decimal :" + dec);
		//System.out.println("please enter decimal number");
		//int decimal = sc.nextInt();
		//int binary = d2b(decimal);
		//System.out.println("decimal :" + binary);
		System.out.println("please enter octal number");
		int octal = sc.nextInt();
		int decimal = o2d(octal);
		System.out.println("decimal :" + decimal);
		

	}
	
	private static int o2d(int octal){
		// TODO Auto-generated method stub
		int decimal = 0;
		int basepow = 1;
		
		while(octal != 0) {
			int bit = octal % 8;
		decimal += bit*basepow;
			basepow *= 10 ;
			octal = octal/ 8;
			
			
			
			
		}
		
		
		return decimal;
	
		
		
	}

	/*public static int b2d(int bin) {
		int dec = 0;
		int basepow = 1;
		
		while(bin != 0) {
			int binbit = bin % 10;
			dec +=binbit*basepow;
			basepow *= 2;
			bin = bin / 10;
			
			
			
		}
		
		
		return dec;
		
	}*/

}
