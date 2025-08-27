package inheritance_practice;

public class Dog extends Animal{
void bark() {
	System.out.println("Doggies bark");
}
	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.hunt();
		eat();
		d.sleep();
		d.bark();
		

	}

}
