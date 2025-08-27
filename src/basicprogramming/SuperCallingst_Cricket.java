package basicprogramming;
class Game
{
	Game(String name_of_Game)
	{
		System.out.println("Game started: Basketball");
	}
}

public class SuperCallingst_Cricket extends Game
{
	SuperCallingst_Cricket(){
		super("Basketball");
		System.out.println("Team B is playing Cricket");
	}

	public static void main(String[] args) {
		new SuperCallingst_Cricket();

	}

}
