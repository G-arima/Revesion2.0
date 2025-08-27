package stringpract;

import java.util.Arrays;

public class Pgm14_pract {

	public static void main(String[] args) {
		// Split function practice
		String name="garima lekhi mahindru";
		String name1[]=name.split(" ");
		for(int i=0;i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
		
		
		System.out.println("*******************");
		//Split from second index
	String name2[]=name.split(" ", 2);
	String name3=Arrays.toString(name2);
	System.out.println("The new string is : " +name3);
	}

}
