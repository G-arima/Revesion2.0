package arrayspract;

import java.util.Arrays;

public class pract9_reverseanarray {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40, 50};
		System.out.println("The elements of the original array are : " +Arrays.toString(arr));
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
				arr1[i]=arr[arr.length-1-i];
			
		}
		System.out.println("The elements of the reversed array are : " +Arrays.toString(arr1));
		
	}

}
