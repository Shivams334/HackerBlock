package lecture5;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		 takeInput(sc,arr);
		 insertionSort(arr);

	}
	
	

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i < arr.length;i++) {
		     for(int j = i-1;j >= 0;j--) {
		    	 if(arr[j] > arr[j+1]) {
		    		 swap(arr,j,j+1);
		    		 
		    	 }
		     }
			
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}



	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
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
