package basicprogramming;

import java.util.Scanner;

public class AreaOfCircle_usingScanner {
 static double pi=Math.PI;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of the radius of the circle");
		double r=sc.nextDouble();
		double area=pi*r*r;
		System.out.println("The area of the circle is : " +area);
		sc.close();

	}

}
