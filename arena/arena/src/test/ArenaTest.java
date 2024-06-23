package test;

import org.junit.Test;

import main.Arena;
import main.Player;

import static org.junit.Assert.*;
public class ArenaTest 
{
	    @Test
	    public void testFight() 
	    {
	        Player playerA = new Player(50, 5, 10);
	        Player playerB = new Player(100, 10, 5);

	        Arena arena = new Arena(playerA, playerB);
	        Player winner = arena.fight();

	        assertTrue(winner.isAlive());
	        assertTrue(!playerA.isAlive() || !playerB.isAlive());
	    }
}
