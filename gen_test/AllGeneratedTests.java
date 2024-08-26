// PlayerTest.java
package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testGetPosition() {
        assertEquals(0, player.getPosition());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetPosition() {
        player.setPosition(10);
        assertEquals(10, player.getPosition());
    }

    @Test
    public void testSetScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testMove() {
        player.move(5);
        assertEquals(5, player.getPosition());
        player.move(-3);
        assertEquals(2, player.getPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveInvalidSteps() {
        player.move(Integer.MAX_VALUE);
    }
}

// EnemyTest.java
package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5);
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testGetPosition() {
        assertEquals(5, enemy.getPosition());
    }

    @Test
    public void testSetType() {
        enemy.setType("Orc");
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testSetPosition() {
        enemy.setPosition(10);
        assertEquals(10, enemy.getPosition());
    }
}

// GameTest.java
package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GameTest {
    private Game game;
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0);
        game = new Game(player);
    }

    @Test
    public void testGetPlayer() {
        assertEquals(player, game.getPlayer());
    }

    @Test
    public void testGetEnemiesEmpty() {
        ArrayList<Enemy> enemies = game.getEnemies();
        assertNotNull(enemies);
        assertEquals(0, enemies.size());
    }

    @Test
    public void testUpdateScoreWithNoCollision() {
        player.move(5);
        game.updateScoreAndCheckCollisions();
        assertEquals(10, player.getScore());
    }

    @Test
    public void testUpdateScoreWithCollision() {
        player.setPosition(5);
        Enemy goblin = new Enemy("Goblin", 5);
        game.getEnemies().add(goblin);
        game.updateScoreAndCheckCollisions();
        assertEquals(0, player.getScore());
    }

    @Test
    public void testUpdateScoreMultipleEnemies() {
        player.move(5);
        Enemy goblin = new Enemy("Goblin", 5);
        Enemy orc = new Enemy("Orc", 3);
        game.getEnemies().add(goblin);
        game.getEnemies().add(orc);
        
        // No collision with the player at position 5
        game.updateScoreAndCheckCollisions();
        assertEquals(0, player.getScore());

        // Move Player to position 10 and add enemy at 10
        player.move(5);
        Enemy bandit = new Enemy("Bandit", 10);
        game.getEnemies().add(bandit);

        // Collision with bandit
        game.updateScoreAndCheckCollisions();
        assertEquals(0, player.getScore());
    }
}