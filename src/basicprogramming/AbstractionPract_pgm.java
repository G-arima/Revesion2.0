package basicprogramming;
abstract class Registration{
	abstract void register();
	void login(){
		System.out.println("Enter the Email id and password and click on login");
	}
}

public class AbstractionPract_pgm extends Registration{
void homepage()
{
	System.out.println("Search the product and add it to the cart");
}
	public static void main(String[] args) {
		AbstractionPract_pgm obj=new AbstractionPract_pgm();
		obj.register();
		obj.login();
		obj.homepage();

	}
	@Override
	void register() {
		System.out.println("Enter the details asked at the time of the registration");
		
	}

}
