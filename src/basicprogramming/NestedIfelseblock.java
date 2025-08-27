package basicprogramming;

import java.util.Scanner;

public class NestedIfelseblock {

	public static void main(String[] args) {
		char gender1='F';
		char gender2='M';

		int age=61;
		
		if(gender1=='M')
		{
			System.out.println("Traveling is free");
		}
		else
		{
			if(age<12)
			{
			System.out.println("Half ticket");	
			}else if(12<=age && age<=59) {
				System.out.println("Full ticket");
			}else {
				System.out.println("Senior citizen ticket is half");
			}
		}
	}

}
