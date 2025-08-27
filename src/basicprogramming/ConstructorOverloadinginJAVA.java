package basicprogramming;

public class ConstructorOverloadinginJAVA {
	ConstructorOverloadinginJAVA()
	{
	System.out.println("Creating multiple constructors but the only thing is there should be difference in number of arguments");	
	}
	ConstructorOverloadinginJAVA(int a)
	{
	System.out.println("Difference in the types of the arguments");	
	}
	ConstructorOverloadinginJAVA(int a,int b)
	{
	System.out.println("Difference in the order of occourance of the arguments");	
	}

	public static void main(String[] args) {
		new ConstructorOverloadinginJAVA();
		new ConstructorOverloadinginJAVA(66);
		new ConstructorOverloadinginJAVA(66,33);

	}

}
