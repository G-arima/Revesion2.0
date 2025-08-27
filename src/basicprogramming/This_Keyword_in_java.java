package basicprogramming;

public class This_Keyword_in_java {
	String name;
	int age;
	double salary;
	void getData(String name, int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public static void main(String[] args) {
		This_Keyword_in_java t1=new This_Keyword_in_java();
		t1.getData("Abhimanyu",31,140000);
	    System.out.println(t1.name);
	    System.out.println(t1.age);
	    System.out.println(t1.salary);
		

	}

}
