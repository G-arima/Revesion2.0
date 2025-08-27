package basicprogramming;
class Student
{
 Student(int a, int b, int c){
	System.out.println("The marks of the first student are 10");
	System.out.println("The marks of the second student are 20");
	System.out.println("The marks of the third student are 30");
}

}
public class Super_calling_st extends Student{
	 Super_calling_st(){
	super(10,20,30);//Super calling statement in JAVA is used to call the parent class constructor together with the child class constructor.
	//Parameterized super calling statement has to be called explicitly but non parameterized super calling statement has to be called implicitly or explicitly
	System.out.println("The total scores are out of 50");

	}

	public static void main(String[] args) {
		new Super_calling_st();

	}

}

