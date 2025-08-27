package arrayspract;

public class pract5 {

	public static void main(String[] args) {
		String name="garimalekhi 1123 $&#";
		int countofAlphabet=0;
		int countofnumeric=0;
		int countofSpaces=0;
		int countofSpecialChars=0;
		char arr1[]=name.toCharArray();
		for(int i=0; i<arr1.length; i++)
		{
			boolean b1=Character.isAlphabetic(arr1[i]);
			if(b1==true)
			{
				countofAlphabet++;
			}
		}
		for(int i=0; i<arr1.length; i++)
		{
			boolean b2=Character.isDigit(arr1[i]);
			if(b2==true)
			{
				countofnumeric++;
			}
		}
		for(int i=0; i<arr1.length; i++)
		{
			boolean b3=Character.isSpaceChar(arr1[i]);
			if(b3==true)
			{
				countofSpaces++;
			}
		}
		System.out.println("The count of the alphabet is : " +countofAlphabet);
		System.out.println("The count of the numbers is : " +countofnumeric);
		System.out.println("The count of the Spaces is : " +countofSpaces);
		 countofSpecialChars= name.length()-(countofAlphabet+countofnumeric+countofSpaces);
		System.out.println("The count of the Special characters is : " +countofSpecialChars);

	}

}
