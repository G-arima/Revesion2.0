package basicprogramming;

import java.util.Scanner;

public class SwitchPrac2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Choose operation : ");
		System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication  \n 4. Division");
		int s=sc.nextInt();
		
		switch(s) 
		{
		case 1:
			System.out.println("The sum of the two numbers is : " +(a+b));
			break;
		case 2:
			System.out.println("The subtraction of the two numbers is : " +(a-b));
			break;
		case 3:
			System.out.println("The multiplication of the two numbers is : " +(a*b));
			break;
		case 4:
			System.out.println("The division of the two numbers is : " +(a/b));
			break;
		default:
			System.out.println("The operation entered is invalid");
		}
		
		
		

	}

}
