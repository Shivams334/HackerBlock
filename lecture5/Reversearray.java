package lecture5;

import java.util.Scanner;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		 takeInput(sc,arr);
		 reverseArray(arr);
		
		

	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
		
		for(int i = 0;i<=arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-(i+1)] ;
			arr[arr.length-(i+1)] = temp;
			
		}
		
		for(int i = 0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
		
	}

	private static void takeInput(Scanner sc, int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i < arr.length;i++) {
			System.out.println("enter" + i+1 + " element");
			arr[i]=sc.nextInt();
		}
		System.out.println("end");
		
	}

}
