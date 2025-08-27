package basicprogramming;

public class MethodOverloading {
void add()
{
System.out.println("My name is Garima and i am working as a software tester");	
}
//Creating multiple methods with the same name is not possible in java, there should be some variation either in the number of arguments, types of arguments or order of occurrence of arguments.
void add(int a)
{
System.out.println("I am currently working in Optum UHG");	
}
static void add(int a, int b)
{
System.out.println("The addition of the two number's is : " +(a+b));	
}
void add(int a,int b, int c)
{
System.out.println("The addition of the three number's is : " +(a+b+c));	
}
void add(boolean a)
{
System.out.println("The default value of the boolean data type is false");	
}

	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		m1.add();
		m1.add(false);
		m1.add(50);
		m1.add(10, 30, 10);
		add(100,200);

	}

}
