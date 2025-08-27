package basicprogramming;

public class LOPract8 {

	public static void main(String[] args) {
		int batteryLevel=5;
		boolean notCharging=true;
		if(batteryLevel<20 && notCharging)
		{
			System.out.println("Device should show low battery warning");
		}else {
			System.out.println("Not show");
		}

	}

}
