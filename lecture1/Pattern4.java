package lecture1;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    
		    Scanner sc = new Scanner(System.in);
			System.out.println("please enter your number");
			int num = sc.nextInt();
		   

		    int i=1,j,k=1;

		    while(i<=num){

		        j=1;

		        while(j<=i){
		                
		            System.out.print(k);
		            
		            j++;
		        }
		        System.out.print("\n");

		        
		        i++;
		        k++;
		    }
		    
		}

	}


