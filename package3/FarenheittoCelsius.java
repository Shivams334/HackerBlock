package package3;

import java.util.Scanner;

public class FarenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter min temp");
		int min = sc.nextInt();
		System.out.println("please enter max temp");
		int max = sc.nextInt();
		System.out.println("please enter step value");
		int stepvalue = sc.nextInt();	
		
		
		int c;
		int f = min;
		
		
		while(f<=max) {
			//c = (5*(f-32)/9);
			c = (int)((5.0/9)*(f-32));
			System.out.println(f +  "  "+ c);
			f = f + stepvalue;
		}
		sc.close();

	}

}
