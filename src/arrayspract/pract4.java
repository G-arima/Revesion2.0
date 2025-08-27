package arrayspract;

public class pract4 {

	public static void main(String[] args) {
		String name="garima lekhi123$";
		int countofAlphabet=0;
		int countofNumbers=0;
		int countofspace=0;
		int countofSC=0;
		char a1[]=name.toCharArray();
		for(int i=0;i<a1.length;i++)
		{
			boolean b1=Character.isAlphabetic(a1[i]);
			if(b1==true)
			{
				countofAlphabet++;
			}
		}
		System.out.println("The count of the alphabet is : " +countofAlphabet);
		for(int i=0;i<a1.length;i++)
		{
			boolean b2=Character.isDigit(a1[i]);
			if(b2==true)
			{
				countofNumbers++;
			}
		}
		System.out.println("The count of the numbers is : " +countofNumbers);
		for(int i=0;i<a1.length;i++)
		{
			boolean b3=Character.isSpaceChar(a1[i]);
			if(b3==true)
			{
				countofspace++;
			}
		}
		System.out.println("The count of the spaces is : " +countofspace);
		countofSC= name.length()-(countofAlphabet+countofNumbers+countofspace);
		System.out.println("The count of Alphanumeric values in String is : " +countofSC);

	}

}
