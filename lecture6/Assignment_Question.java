package lecture6;

import java.util.Scanner;

public class Assignment_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your String");
		String sr = sc.next();
	System.out.println(replace(sr));
//		

	}

	private static String replace(String sr) {
		// TODO Auto-generated method stub
//		String s2 = "";
//		for(int i = 0;i < sr.length();i++) {
//			if(i%2 == 0) {
//				s2 += (char)(sr.charAt(i) - 1);
//			}
//			else {
//				s2 += (char)(sr.charAt(i) + 1);
//				
//			}
//		}
//		return s2;
		
		
//-------------------------------------------------------------------------------------------
		//StringBuilder are mutable
		
		StringBuilder s2 = new StringBuilder("");
		for(int i = 0;i < sr.length();i++) {
			if(i%2 == 0) {
				s2 .append((char)(sr.charAt(i) - 1));
			}
			else {
				s2 .append((char)(sr.charAt(i) + 1));
				
			}
		}
	  return s2.toString();
	
		
	}

}
