package basicprogramming;

public class This_calling_st {
This_calling_st(){
this(15,20,25);
System.out.println("This is a default constructor");
}
This_calling_st(int a){
System.out.println("This is a constructor with one parameter");	
}
This_calling_st(int a, int b){
	this(40);
System.out.println("This is a constructor with two parameters");	
}
This_calling_st(int a, int b, int c){
	this(30,35);
	System.out.println("This is a constructor with three parameters");
}

	public static void main(String[] args) {
		new This_calling_st();

	}

}
