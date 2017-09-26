package recursion;

import java.util.Scanner;

public class Rec_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ennter value of n");
		int n = sc.nextInt();
		int row = 1,col = 1;
		pt(n,row,col);
		

	}

	private static void pt(int n, int row, int col) {
		// TODO Auto-generated method stub
		
	if(row > col) {	
	if(col <= row) {
		
		System.out.print("*  ");
		
		pt(n,row,col+1);
	
	}else 
		//if(row < n){
	{
			System.out.print("\n");
		
			pt(n,row+1,1);
	}
	
		
	
	}

}
	}
