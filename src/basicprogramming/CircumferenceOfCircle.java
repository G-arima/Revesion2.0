package basicprogramming;

import java.util.Scanner;

public class CircumferenceOfCircle {
static double pi=Math.PI;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double r=sc.nextDouble();
		double circumference=2*pi*r;
		System.out.println("The circumference of the circle is : " +circumference);
		

	}

}
