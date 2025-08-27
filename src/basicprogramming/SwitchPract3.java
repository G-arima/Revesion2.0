package basicprogramming;

import java.util.Scanner;

public class SwitchPract3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grade of the student out of : =   'A', 'B', 'C', 'D' ,'F'");
		char grade=sc.next().charAt(0);
		switch(grade) {
		case 'A':
			System.out.println("If A is entered then that means Excellent");
			break;
		case 'B':
			System.out.println("If B is entered then that means Good");
			break;
		case 'C':
			System.out.println("If C is entered then that means Average");
			break;
		case 'D':
			System.out.println("If D is entered then that means Poor");
			break;
		case 'F':
			System.out.println("If F is entered then that means Fail");
			break;
			default:
				System.out.println("Invalid GRADE");
				sc.close();
		}
		
		
		

	}

}
