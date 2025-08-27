package stringpract;

public class Pract_pgm1 {

	public static void main(String[] args) {
		String name=" Garima Lekhi Mahindru ";
		int l1=name.length();
		System.out.println(l1);//23
		String name1=name.trim();
		System.out.println(name1);//Garima Lekhi Mahindru
		String name2=name.toLowerCase();// garima lekhi mahindru
		System.out.println(name2);
		String name3=name.toUpperCase();// GARIMA LEKHI MAHINDRU
		System.out.println(name3);
		char c=name.charAt(5);
		System.out.println(c);//m
		int a=name.indexOf('L');
		System.out.println(a);//8
		String name4=name.substring(8, 13);//Lekhi 
		System.out.println(name4);
		String name5=name.substring(1);
		System.out.println(name5);//Garima Lekhi Mahindru
		

	}

}
