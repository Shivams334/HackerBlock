package lecture5;

import java.util.Scanner;

public class ArrBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {1,2,3,4,5};
//		System.out.println(arr);
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of the array");
	int n = sc.nextInt();
	 int[] arr = new int[n];
	 takeInput(sc,arr);
	 display(arr);
	 max(arr);
	 
	 
	 
	}

	public static void max(int[] arr) {
		// TODO Auto-generated method stub
		int c=arr[0];
		for(int i = 0;i <= arr.length-1;i++) {
			if(c < arr[i]) {
				c = arr[i];
			}
		
			
		}
		System.out.println("largest number" + c);
		
		
	}

	public static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	public static void takeInput(Scanner sc, int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i < arr.length;i++) {
			System.out.println("enter" + i+1 + " element");
			arr[i]=sc.nextInt();
		}
		System.out.println("end");
	
		
	}

}
