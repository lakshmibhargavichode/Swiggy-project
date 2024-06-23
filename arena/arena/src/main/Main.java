package main;

public class Main 
{
	public static void main(String[] args) 
	{
		Player playerA = new Player(50, 5, 10);
		Player playerB = new Player(100, 10, 5);

		Arena arena = new Arena(playerA, playerB);
		Player winner = arena.fight();
		
		if(winner==playerA)
		{
			System.out.println("The winner is Player A");
		}
		else
		{
			System.out.println("The winner is Player B");
		}
	}


}
