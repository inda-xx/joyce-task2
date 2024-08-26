package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// Assuming Player.java, Enemy.java, and GameMap.java are part of the `game` package.
import game.Player;
import game.Enemy;
import game.GameMap;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 100);
    }

    @Test
    public void testInitialState() {
        assertEquals("Hero", player.getPlayerName());
        assertEquals(0, player.getScore());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testMoveUpBoundary() {
        player.moveUp();
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testMoveDownWithinBounds() {
        player.moveDown();
        assertEquals(1, player.getYPosition());
    }

    @Test
    public void testMoveLeftBoundary() {
        player.moveLeft();
        assertEquals(0, player.getXPosition());
    }

    @Test
    public void testMoveRightWithinBounds() {
        player.moveRight();
        assertEquals(1, player.getXPosition());
    }

    @Test
    public void testPlayerNameSetter() {
        player.setPlayerName("Warrior");
        assertEquals("Warrior", player.getPlayerName());
    }

    @Test
    public void testScoreSetterAndGetter() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testHealthSetterAndGetter() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testScoreIncrease() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEncounterEnemy() {
        player.encounterEnemy(10);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testMaxBoundaryForYPosition() {
        for (int i = 0; i < 5; i++) {
            player.moveDown();
        }
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testMaxBoundaryForXPosition() {
        for (int i = 0; i < 5; i++) {
            player.moveRight();
        }
        assertEquals(4, player.getXPosition());
    }
}

package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// Assuming Player.java, Enemy.java, and GameMap.java are part of the `game` package.
import game.Player;
import game.Enemy;

public class EnemyTest {

    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 30, 10);
        player = new Player("Hero", 0, 100);
    }

    @Test
    public void testInitialState() {
        assertEquals("Goblin", enemy.getEnemyType());
        assertEquals(30, enemy.getHealth());
        assertEquals(10, enemy.getDamageLevel());
    }

    @Test
    public void testSetEnemyTypeAndGetMethod() {
        enemy.setEnemyType("Orc");
        assertEquals("Orc", enemy.getEnemyType());
    }

    @Test
    public void testSetHealthAndGet() {
        enemy.setHealth(25);
        assertEquals(25, enemy.getHealth());
    }

    @Test
    public void testSetDamageLevelAndGet() {
        enemy.setDamageLevel(15);
        assertEquals(15, enemy.getDamageLevel());
    }

    @Test
    public void testAttackPlayer() {
        enemy.attack(player);
        assertEquals(90, player.getHealth());
    }
}

package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

// Assuming GameMap.java is part of the `game` package.
import game.Player;
import game.Enemy;
import game.GameMap;

public class GameMapTest {

    private GameMap gameMap;
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        gameMap = new GameMap();
        player = new Player("Hero", 0, 100);
        enemy = new Enemy("Goblin", 30, 10);
    }

    @Test
    public void testMapInitialize() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals('.', gameMap.mapLayout[i][j]); // Assuming mapLayout is accessible for testing
            }
        }
    }

    @Test
    public void testUpdateMapWithPlayer() {
        player.moveRight();
        player.moveDown();
        gameMap.updateMapWithPlayer(player);
        assertEquals('P', gameMap.mapLayout[1][1]);
    }

    @Test
    public void testUpdateMapWithEnemy() {
        gameMap.updateMapWithEnemy(enemy);
        assertEquals('E', gameMap.mapLayout[enemy.getYPosition()][enemy.getXPosition()]);
    }

    // Test case to check if map is cleared and updated correctly with both player and enemy
    @Test
    public void testFullMapUpdate() {
        player.moveRight();
        player.moveDown();
        gameMap.updateMapWithPlayer(player);
        gameMap.updateMapWithEnemy(enemy);

        char[][] expectedMap = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                expectedMap[i][j] = '.';
            }
        }
        expectedMap[1][1] = 'P';
        if (expectedMap[enemy.getYPosition()][enemy.getXPosition()] == '.') {
            expectedMap[enemy.getYPosition()][enemy.getXPosition()] = 'E';
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals(expectedMap[i][j], gameMap.mapLayout[i][j]);
            }
        }
    }
}