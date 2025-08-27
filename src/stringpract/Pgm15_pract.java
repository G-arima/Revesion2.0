package stringpract;

import java.util.Arrays;

public class Pgm15_pract {

	public static void main(String[] args) {
		// Check if the two Strings are the anagram of each other or not.
		String s1="read";
		String s2="dear";
		if(s1.length()==s2.length())
		{
			System.out.println("The given two Strings can be the anagram of each other");
			char arr1[]=s1.toCharArray();//[r,e,a,d]
			char arr2[]=s2.toCharArray();//[d,e,a,r]
			 Arrays.sort(arr1);//[a,d,e,r]
			Arrays.sort(arr2);//[a,d,e,r]
			boolean b1=Arrays.equals(arr1, arr2);
			if(b1==true)
			{
				System.out.println("Is anagram");
			}else {
				System.out.println("Not anagram");
			}
		} else {
			System.out.println("Not an anagram");
		}
	}

}
