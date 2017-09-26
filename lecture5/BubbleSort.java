package lecture5;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = sc.nextInt();
		 int[] arr = new int[n];
		 takeInput(sc,arr);
		 
		 bubbleSort(arr);

	}
	
	
	
	public static void takeInput(Scanner sc, int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i < arr.length;i++) {
			System.out.println("enter" + i+1 + " element");
			arr[i]=sc.nextInt();
		}
		System.out.println("end");
	
		
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int i=0,j=0,temp=0;
		
		for(i=0 ;i<=arr.length-1;i++ ) {
			for(j=0;j<=arr.length-(i+2);j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		
		
		for(i=0 ;i<=arr.length-1;i++ ) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
	}
	

}
