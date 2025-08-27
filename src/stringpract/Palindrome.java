package stringpract;

public class Palindrome {

	public static void main(String[] args) {
		String name="radar";
		String output=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			output=output+name.charAt(i);
		}
		System.out.println("The output of the given String is : " +output);
		if(output.equalsIgnoreCase(name))
		{
			System.out.println("The given two Strings are the palindrome of each other");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
