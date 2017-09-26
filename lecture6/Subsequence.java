package lecture6;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your String");
		String sr = sc.next();
		
        subseq(sr);
        
		
		
		

	}

	private static void subseq(String sr) {
		// TODO Auto-generated method stub
		int limit = (int)Math.pow(2,sr.length());
		int counter = 0;
		while(counter > 0) {
			String word = "";
			int stringind = sr.length()-1;
			
			
			
			
			
		}
		
	}

}
