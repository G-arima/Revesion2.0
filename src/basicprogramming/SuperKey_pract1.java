package basicprogramming;
class Person1 {
	void displayName() {
	System.out.println("Displays the name of the person");	
	}
}

public class SuperKey_pract1 extends Person1{
	void displayName() {
		super.displayName();
		System.out.println("Displays the name of the UHG employee");
	}

	public static void main(String[] args) {
		SuperKey_pract1 s1=new SuperKey_pract1();
		s1.displayName();
	}

}
