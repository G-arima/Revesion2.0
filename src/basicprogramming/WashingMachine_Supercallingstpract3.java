package basicprogramming;
class Appliance {
Appliance(String brandname){
	System.out.println("The name of the brand is Piegon");
}
}

public class WashingMachine_Supercallingstpract3 extends Appliance{
	WashingMachine_Supercallingstpract3(){
		super("Piegon");
		System.out.println("The washing machiene brand name is Samsung");
		System.out.println("The price of 9l is 35000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new WashingMachine_Supercallingstpract3();
	}

}
