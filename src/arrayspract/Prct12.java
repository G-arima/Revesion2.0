package arrayspract;

import java.util.Arrays;
import java.util.Scanner;

public class Prct12 {

	public static void main(String[] args) {
		//int size=0;
		//Pass the values of an array from the scanner class
		int arr1[]=new int[6];
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of an array between 1 to 10");
		 //size=sc.nextInt();
		// System.out.println("The size of an array is : " +size);
		 //sc.close();
		Scanner sc1=new Scanner(System.in); 
		for(int i=0;i<arr1.length;i++)
		{
			
			System.out.println("Please enter the values of an array one by one");
			 arr1[i]=sc1.nextInt();
		}
		System.out.println("THe values of an array are : " +Arrays.toString(arr1));
		sc1.close();

	}

}
