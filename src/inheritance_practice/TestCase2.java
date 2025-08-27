package inheritance_practice;

public class TestCase2 extends Launch_and_Quit{

	public void homepage() {
		System.out.println("Post login user is now on homepage");
	}
	public static void main(String[] args) {
		TestCase2 t2=new TestCase2();
		t2.launch();
		
		TestCase1 t1=new TestCase1();
		t1.login();
		
		t2.homepage();
		t2.quit();
		
	}

}
