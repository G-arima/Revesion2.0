package basicprogramming;

public class GlobalVariable_pgm1 {
static double num;
static boolean flag;
int a=90;
int b=30;
//1. Global variables are those variables which are declared inside the class but outside the method.
//2. The scope of the global variable is inside the class but outside the method.
//3. THe Global variables are both static and non static in nature.
//4. Global variables can be initialized with default values.
//5. Global variables can be utilized without initialization. They can be utilized only by declaration.
	public static void main(String[] args) {
	System.out.println("The default value of double is : " +num);
	System.out.println("The default value of boolean is : " +flag);
	GlobalVariable_pgm1 obj=new GlobalVariable_pgm1();
	System.out.println("The value of variable is a is : " +obj.a);
	System.out.println("The value of variable is b is : " +obj.b);

	}

}
