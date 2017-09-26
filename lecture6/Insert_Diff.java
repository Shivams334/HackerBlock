package lecture6;

import java.util.Scanner;

public class Insert_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter your String");
		String sr = sc.next();
		System.out.println(insert_Diff(sr));
		

	}

	private static String insert_Diff(String sr) {
		// TODO Auto-generated method stub

		StringBuilder s2 = new StringBuilder(sr.charAt(0) + "");
		
		for(int i = 1;i < sr.length();i++) {
			int diff = sr.charAt(i) - sr.charAt(i-1);
			s2.append(diff);
			s2.append(sr.charAt(i));
		}
		
		
		
		
		
		
		
		return s2.toString();
		
	}

}
