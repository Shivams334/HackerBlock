package lecture5;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter size of the array");
//		int n = sc.nextInt();
//		 int[][] arr = new int[n][];
//		 takeInput(sc,arr);
//		 display(arr);
//		 waveDisplay(arr);
		
		int[][] arr = {{1,2,3,4},
				{5,6,6,8},
				{9,10,11,12},
				{13,14,15,16}};
		}

	

	private static void waveDisplay(int[][] arr) {
		// TODO Auto-generated method stub
	for(int col = 0;col < arr[0].length;col++) {
		{
			if(col % 2 == 0) {
				for(int row = 0; row <arr.length;row++) {
					System.out.println(arr[col][row] + " ");}
				}
				
				
				else{ 
					for(int row = arr.length-1;row>=0;row--) {
						System.out.println(arr[row][col]+ "'");
						
					}
				}
			}
		}
	}	
		
		
	
		
	

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int row = 0;row < arr.length;row++) {
			for(int col = 0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+ ",");
			}
			System.out.println("END");
		}
		
		
	}

	public static void takeInput(Scanner sc, int[][] arr) {
		// TODO Auto-generated method stub
	
		
		
		for(int row = 0;row<arr.length;row++) {
			System.out.println("enter no. of columns in a row");
			int cols = sc.nextInt();
			arr[row] = new int[cols];
			for(int col = 0;col<arr[row].length;col++) {
				System.out.println("enter element at" +row+ "," + cols);
				arr[row][col] = sc.nextInt();
				
			}
		}
		
	}
	
	

}
