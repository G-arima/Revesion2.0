package basicprogramming;

class Shiva
{
	Shiva()
	{
		System.out.println("I asked Shiva for flowers but Shiva gave me Rain instead");
	}
}
public class Super_calling_st1 extends Shiva
{
Super_calling_st1()
{
	//super();
	System.out.println("This means God doesn't gives you what you want , but he gives you what you need the most");
}
	public static void main(String[] args) {
		
    new Super_calling_st1();
	}

}
