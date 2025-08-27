package basicprogramming;

public class LOPract4 {
public static void main(String[] args) 
{
//Check if a person can ride a bike only if they have both a helmet AND a valid license.	
	boolean has_helmet=true;
	boolean valid_license=true;
	if(has_helmet && valid_license)
	{
		System.out.println("Person can ride a bike");
	}else {
		System.out.println("Can't ride a bike");
	}
}
}
