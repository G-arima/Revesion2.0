package basicprogramming;

import java.util.Scanner;

public class Pract_ExceptionHandling {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in an array");
		try {
		for(int i=0;i<=arr.length;i++)
		{
	        arr[i]=sc.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("Handled the exception");
		}

	}

}
