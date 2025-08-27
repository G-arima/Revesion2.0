package arrayspract;

import java.util.Arrays;
import java.util.Scanner;

public class pract7 {

	public static void main(String[] args) {
		//Trying to pass the value of an Array from the scanner class
		//int size=0;
		//int arr[]=new int[size];
		//datatype variable[]=new datatype[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
	    System.out.println("The size of the array is : " +size);
	    int arr[]=new int[size];
	    for(int i=0; i<size; i++)
	    {
	    System.out.println("Enter the values : ");
	    arr[i]=sc.nextInt();
	    }
	    System.out.println("The elements of the array are : ");
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println(arr[i]);
	    }
		
		
	}

}
