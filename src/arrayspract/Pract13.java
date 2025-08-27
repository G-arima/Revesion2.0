package arrayspract;

import java.util.Arrays;

public class Pract13 {

	public static void main(String[] args) {
		//int arr1[]=new int[5];
		int arr1[]= {10,20,30,40,50};
		System.out.println("The values of first array are : " +Arrays.toString(arr1));
		int arr2[]=new int[5];
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		//Arrays.toString(arr2);
		System.out.println("The values of the copied array are : " +Arrays.toString(arr2));

	}

}
