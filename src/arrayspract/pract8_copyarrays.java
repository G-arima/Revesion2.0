package arrayspract;

import java.util.Arrays;

public class pract8_copyarrays {

	public static void main(String[] args) {
		// Trying to copy the values of one array into the another array
		//int arr[]=new int[5];
		int arr[]= {10, 20, 30, 40, 50};
		System.out.println("The values of the original array are : " +Arrays.toString(arr));
		int arr1[]=new int[5];
		System.out.println("The values of the copied array are : ");
		for(int i=0;i<arr1.length;i++)
		{
	     //System.out.println(arr[i]);
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
		//System.out.println();
		
	}

}
