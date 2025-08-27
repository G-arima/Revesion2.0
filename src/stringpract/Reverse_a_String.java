package stringpract;

public class Reverse_a_String {

	public static void main(String[] args) {
		String name="anurag";
		String output="";
		//garuna
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			output=output+c;
		}
		System.out.println("The output of the name is : " +output);//garuna
	}

}
