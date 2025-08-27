package inheritance_practice;

public class Cat extends Dog{

	public void fourlegs() {
		System.out.println("Cat also has four legs");
	}
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.fourlegs();
		c1.bark();
		c1.hunt();
		eat();
		c1.sleep();
		
	}
}
