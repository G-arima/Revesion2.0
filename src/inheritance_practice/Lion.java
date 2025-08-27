package inheritance_practice;

public class Lion extends Animal{
public static void head() {
	System.out.println("The lion is the king of the jungle");
}
public void roar() {
	System.out.println("The lion roars");
}
	public static void main(String[] args) {
		Lion.head();
	//Lion.head();
		Lion a1=new Lion();
		a1.roar();
		a1.hunt();
		Animal.eat();
		a1.sleep();
		
		

	}

}
