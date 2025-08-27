package basicprogramming;

public class This_keyword_pract1 {
	String name;
	int age;
	double percentage;
	void setDetails(String name, int age, double percentage) {
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		
	}

	public static void main(String[] args) {
		This_keyword_pract1 t1=new This_keyword_pract1();
		t1.setDetails("Krishiv", 31, 99.99);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.percentage);

	}

}
