package basicprogramming;

public interface Pratpgm_Interface {
void addition();
void subtraction();

}
class Concrete implements Pratpgm_Interface{
	static int c=100;
	static int d=200;
	static int e=200;
	static int f=100;
void multiplication(int a,int b) {
	System.out.println("The result of the multiplication of the two numbers is : " +a*b);
}



@Override
public void addition() {

	System.out.println("The addition of the two numbers is : " +(c+d));
	
}

@Override
public void subtraction() {

	System.out.println("The subtraction of the two numbers is : " +(e-f));
	
}
}
class Ground extends Concrete{
	
void division(int g, int h) {
	System.out.println("The division of the two numbers is : " +(g/h));
}
public static void main(String args[]) {
	Ground g1=new Ground();
	g1.division(10,5);
	g1.multiplication(10,10);
	g1.addition();
	g1.subtraction();
}
	}
