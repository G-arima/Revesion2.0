package basicprogramming;

import java.util.Scanner;

public class AreaOfTrapezium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of side s1");
		double s1=sc.nextDouble();
		System.out.println("Enter the value of side s2");
		double s2=sc.nextDouble();
		System.out.println("Enter the value of the height");
		double h=sc.nextDouble();
		double area=0.5*(s1+s2)*h;
		System.out.println("The area of the trapezium is : " +area);

	}

}
