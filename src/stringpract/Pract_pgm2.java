package stringpract;

public class Pract_pgm2 {

	public static void main(String[] args) 
	{
		String name1="garima";
		String name2="lekhi";
		String name3="GARIMA";
		boolean b1=name1.equals(name2);
		System.out.println(b1);//false
		boolean b2=name1.equalsIgnoreCase(name3);
		System.out.println(b2);//true
		String name4=name1.concat(name2);
		System.out.println(name4);//garimalekhi
		
	}

}
