package basicprogramming;

import java.util.Scanner;

public class AreaOfRectengle_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectengle");
		double l=sc.nextDouble();
		System.out.println("Enter the breadth of the rectengle");
		double b=sc.nextDouble();
		System.out.println("The area of the rectengle is : " +(l*b));

	}

}
