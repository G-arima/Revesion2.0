package basicprogramming;

public class Book_thiscallingstprc1 {
	Book_thiscallingstprc1(){
		this(55);
		System.out.println("This is a default constructor");
	}
	Book_thiscallingstprc1(int a){
		System.out.println("This is a constructor with one parameter");
	}
	public static void main(String[] args) {
		new Book_thiscallingstprc1();
		

	}

}
