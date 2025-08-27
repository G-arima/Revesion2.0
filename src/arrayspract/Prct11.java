package arrayspract;

import java.util.Arrays;

public class Prct11 {

	public static void main(String[] args) {
		// Check if the two arrays are equals to each other or not
		//int arr1[]=new int[5];
		//datatype variable[]=new datatype[size];
		 int arr1[]= {10, 30, 50, 70, 90};
		int arr2[]= {20, 40, 60, 80, 100, 120, 140};
		boolean b1=Arrays.equals(arr1, arr2);
		if(b1==true)
		{
			System.out.println("The size and the content of the array both are equals to each other");
		}else {
			System.out.println("Both the arrays are not equals to each other");
		}
		
		

	}

}
