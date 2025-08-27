package basicprogramming;

public class LocalVariable_pgm2 {
	public void chatbot(){
	int a=75;//The scope of the local variable is inside the method
	int b=97;//The local variable's are always non static in nature
	//Local variables can never be utilized without initialization.
	//Local variables do not have any default values.
	System.out.println("The sum of a and b is : " +(a+b));
	}

	public static void main(String[] args) {
		LocalVariable_pgm2 myobj=new LocalVariable_pgm2();
		myobj.chatbot();
}

}
