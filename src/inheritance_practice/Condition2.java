package inheritance_practice;

public class Condition2 extends Condition1{
	public static void wellsfargo() {
		System.out.println("Sub class extends it's properties from super class which is Condition 1 here");
	}
	public static void main(String[] args) {
		Condition2 c2=new Condition2();
		c2.launch();
		c2.dependent();
		wellsfargo();
	}

}
