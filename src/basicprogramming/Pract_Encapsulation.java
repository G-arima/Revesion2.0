package basicprogramming;

public class Pract_Encapsulation {
	private String username="contact@mediways.com";
	private String password="Mediways@123";
	public String getusername()
	{
		return username;
	}
    public void setusername(String username)
    {
    this.username=username;
    }
    public String getpassword()
    {
    	return password;
    }
    public void setpassword(String password) {
    	this.password=password;
    }
	public static void main(String[] args) {
		Pract_Encapsulation pe=new Pract_Encapsulation();
		pe.setusername("testing123@gmail.com");
		System.out.println(pe.getusername());
		pe.setpassword("testing@123");
		System.out.println(pe.getpassword());
        
        
	}

}
