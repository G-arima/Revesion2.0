package basicprogramming;

public class Circle_thisKeywordprac3 {
 double radius=25;
static double pi=Math.PI;
void calculateArea(double radius) {
	this.radius=radius;
}
	public static void main(String[] args) {
		Circle_thisKeywordprac3 c3=new Circle_thisKeywordprac3();
		c3.calculateArea(25);
		System.out.println("The area of the circle is : "+pi*c3.radius*c3.radius);

	}

}
