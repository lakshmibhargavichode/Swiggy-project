package main;

import test.*;
public class Arena 
{
	private Player playerA;
	private Player playerB;
	private Dice dice;

	public Arena(Player playerA, Player playerB)
	{
		this.playerA = playerA;
		this.playerB = playerB;
		this.dice = new Dice();
	}
	public Player fight() 
	{
		Player attacker, defender;

		while (playerA.isAlive() && playerB.isAlive()) 
		{
			if (playerA.getHealth() <= playerB.getHealth()) 
			{
				attacker = playerA;
				defender = playerB;
			} 
			else 
			{
				attacker = playerB;
				defender = playerA;
			}

			int attackRoll = dice.roll();
			int defenseRoll = dice.roll();

			int attackDamage = attacker.performAttack(attackRoll);
			int defenseValue = defender.performDefense(defenseRoll);

			int damageDealt = Math.max(0, attackDamage - defenseValue);
			defender.takeDamage(damageDealt);

			System.out.printf("%s attacks %s for %d damage (%d attack roll, %d defense roll)%n", 
					attacker == playerA ? "Player A" : "Player B", 
							defender == playerA ? "Player A" : "Player B", 
									damageDealt, attackRoll, defenseRoll);
		}

	
		if(playerA.isAlive())
		{
			return playerA;
		}
		else
		{
			return playerB;
		}
	}

}
