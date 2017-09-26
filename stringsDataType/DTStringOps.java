package stringsDataType;

import java.util.Scanner;

public class DTStringOps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "hello";
//		String s2 = "hello";
//		//System.out.println(s1==s2);// "==" not suitable for comparing 
//	    String s3 = "" +s1.charAt(0) + s2.charAt(3);
//	    String s4 =  s1.charAt(0) +""+ s2.charAt(3);
//	
//	
//	
	
		   Scanner sc = new Scanner(System.in);
					System.out.println("please enter your string");
					String sr = sc.next();
		
//	
//		String s2 = s1.substring(3);
//		String s3 = s1.substring(3,6);
//		//String s4 = s1.substring(3,11);
//		
//	
//	System.out.println(s2);
//	System.out.println(s3);
//	//System.out.println(s4);
//	

	int num = sr.length();
	
	for(int i=0;i<num;i++) {
		
		for(int j = i+1;j<=num;j++) {
		
		
		String s2 = sr.substring(i,j);
		System.out.println(s2);
		
		}
		
	}
	
	
	
	
	
	
	}
	

}
