package arrayspract;

import java.util.Arrays;

public class pract3 {

	public static void main(String[] args) {
	String s1[]=new String[6];
	s1[0]="Khevanya";
	s1[1]="Patiala";
	s1[2]="Ivaan";
	s1[3]="September";
	s1[4]="Ludhiana";
	s1[5]="Zoyee";
String s2=Arrays.toString(s1);   
    System.out.println("The values of the array are : " +s2);
   Arrays.sort(s1);
   String sortedarray=Arrays.toString(s1);
   System.out.println("The sorted values of the array are : " +sortedarray);
   
	
	

	}

}
