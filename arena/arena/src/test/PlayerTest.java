package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Player;

public class PlayerTest 
{
	@Test
	public void testPlayerCreation() 
	{
		Player player = new Player(50, 5, 10);
		assertEquals(50, player.getHealth());
	}

	@Test
	public void testPlayerAttack() 
	{
		Player player = new Player(50, 5, 10);
		int damage = player.performAttack(4);
		assertEquals(40, damage);
	}

	@Test
	public void testPlayerDefense() 
	{
		Player player = new Player(50, 5, 10);
		int defense = player.performDefense(3);
		assertEquals(15, defense);
	}

}
