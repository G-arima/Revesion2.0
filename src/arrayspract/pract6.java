package arrayspract;

import java.util.Arrays;

public class pract6 {

	public static void main(String[] args) {
		String name="garima";
		String name1="harima";
		
		char arr[]=name.toCharArray();//[g, a, r, i, m, a]
		char arr1[]=name1.toCharArray();//[h, a, r, i, m, a]
		
		/*if(arr.length==arr1.length)
		{
			System.out.println("Size is equals");
		}else {
			System.out.println("Size not equals");
		}*/
		boolean b1=Arrays.equals(arr, arr1);
		if(b1==true)
		{
			System.out.println("The size and content of the two arrays is equals to each other");
		}else {
			System.out.println("Not equals");
		}
		
	}

}
