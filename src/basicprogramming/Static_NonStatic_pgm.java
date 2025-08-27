package basicprogramming;

public class Static_NonStatic_pgm {
	void addition(int a,int b) {
		System.out.println("The addition of the two number's is : " +(a+b));
	}
	static void subtraction(int c, int d) {
		System.out.println("The subtraction of the two number's is : " +(c-d));
	}
	void division(int e, int f) {
		System.out.println("The division of the two number's is : " +e/f);
	}
	void multiplication(int g, int h) {
		System.out.println("The multiplication of the two number's is : " +(g*h));
	}
	

	public static void main(String[] args) {
		subtraction(60,20);
		Static_NonStatic_pgm obj=new Static_NonStatic_pgm();
		obj.addition(100, 20);
		obj.division(90, 30);
		obj.multiplication(30, 30);

	}

}
