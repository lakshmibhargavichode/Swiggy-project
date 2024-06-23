package main;

public class Player 
{
	private int health;
	private int strength;
	private int attack;

	public Player(int health, int strength, int attack) 
	{
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	public int getHealth()
	{
		return health;
	}

	public boolean isAlive()
	{
		return health > 0;
	}

	public void takeDamage(int damage)
	{
		this.health -= damage;
	}

	public int performAttack(int attackRoll) 
	{
		return attack * attackRoll;
	}

	public int performDefense(int defenseRoll)
	{
		return strength * defenseRoll;
	}

}

