package methodoverriding;

class Method_Over1 
{
	
	 void login() 
	{
	System.out.println("Login with an email id");	
	}

}
class Method_Over2 extends Method_Over1
{
    void login()
	{
    	super.login();
	System.out.println("Login with a mobile number");	
	}
	public static void main(String[] args) 
	{
		Method_Over2 m2=new Method_Over2();
		m2.login();
	
		
	}
}

