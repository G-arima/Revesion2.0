package methodoverriding;

public class Animal {
	void sound()
	{
		System.out.println("Animals makes sound");
	}

}
class Dog extends Animal
{
	void sound()
	{
		super.sound();
		System.out.println("dogs will bark");
	}
	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.sound();
	}
}
