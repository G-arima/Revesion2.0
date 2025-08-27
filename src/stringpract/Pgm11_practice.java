package stringpract;

public class Pgm11_practice {

	public static void main(String[] args) {
		// In a given String replace all the capital letters with nothing
		String name="GarimaLekhiMahindru";
		String name1=name.replaceAll("[A-Z]", "");
		System.out.println("The value of the new String is : " +name1);
		//In the given String name remove all the lower case letters
		String name2=name.replaceAll("[a-z]", "");
		System.out.println("The value of the new String is : " +name2);
		//In the given String remove all the numerics
		String name3="KVM School number 1";
		String name4=name3.replaceAll("[1-9]", "");
		System.out.println("The value of the new String is : " +name4);
		

	}

}
