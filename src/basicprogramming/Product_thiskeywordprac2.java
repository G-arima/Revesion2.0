package basicprogramming;

public class Product_thiskeywordprac2 {
	int id;
	double price;
	void getDetails(int id, double price) {
		this.id=id;
		this.price=price;
	}

	public static void main(String[] args) {
		Product_thiskeywordprac2 p2=new Product_thiskeywordprac2();
		p2.getDetails(75, 88000);
		System.out.println(p2.id);
		System.out.println(p2.price);
	}

}
