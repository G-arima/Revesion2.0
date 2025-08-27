package arrayspract;

public class Pract10 {

	public static void main(String[] args) {
		//How to find out the number of the special characters in a String.
		String name="garima lekhi123$#";
		int no_of_alphabets=0;
		int no_of_spaces=0;
		int no_of_numeric=0;
		int no_of_special_chars=0;
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			boolean b1=Character.isAlphabetic(ch);
			if(b1==true)
			{
				no_of_alphabets++;//11
			}
			
		}
		System.out.println("The number of the alphabets in the given String is : " +no_of_alphabets);
		
		for(int i=0;i<name.length();i++)
		{
			char b=name.charAt(i);
			boolean b2=Character.isSpaceChar(b);
			if(b2==true)
			{
				no_of_spaces++;//1
			}
		}
		System.out.println("The number of Spaces in a given String are : " +no_of_spaces);
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			boolean b3=Character.isDigit(c);
			if(b3==true)
			{
				no_of_numeric++;//3
			}
		}
		
		
		System.out.println("The number of the digits in the given String are : " +no_of_numeric);
		 no_of_special_chars=name.length()-(no_of_alphabets+no_of_numeric+no_of_spaces);//17-(11+3+1)
		System.out.println("The number of Special characters in the given String are : "+no_of_special_chars);

	}

}
