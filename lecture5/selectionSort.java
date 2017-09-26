package lecture5;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		 takeInput(sc,arr);
		 selectionSort(arr);

	}
	
	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int i ;
		for(i=0;i<arr.length-1;i++) {
		int minIndex = i;
			for(int j = i+1;j<arr.length-1;j++) {
				minIndex = j;
				}
			swap(arr,i,minIndex);
				
			}
		}
		
	private static void swap(int[] arr, int i, int minIndex) {
		// TODO Auto-generated method stub
		
		int temp = 0;
		if(arr[i]>arr[minIndex]) {
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
			
		
		for(i = 0;i<arr.length;i++) {
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
