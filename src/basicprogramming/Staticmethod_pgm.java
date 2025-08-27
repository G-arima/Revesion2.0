package basicprogramming;

public class Staticmethod_pgm {
	
	public static void addition(int a, int b) {
		System.out.println("The addition of the two numbers is : " +(a+b));
	}
	public static void subtraction(int c,int d)
	{
		System.out.println("The subtraction of the two numbers is : " +(c-d));
	}

	public static void main(String[] args) {
		Staticmethod_pgm.addition(50,50);
		Staticmethod_pgm.subtraction(100,20);

	}

}
