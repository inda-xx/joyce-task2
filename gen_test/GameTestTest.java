class GameTest {
    private Player player;
    private Enemy goblin;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        goblin = new Enemy("Goblin", 1, 0);
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, player.getXPos());
        assertEquals(0, player.getYPos());
    }

    @Test
    public void testPlayerMove() {
        player.move(1, 0);
        assertEquals(1, player.getXPos());
        assertEquals(0, player.getYPos());
        
        player.move(0, 1);
        assertEquals(1, player.getXPos());
        assertEquals(1, player.getYPos());
    }

    @Test
    public void testPlayerScoreInitial() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerInteractWithEnemy() {
        player.move(1, 0); // Move player to enemy's position
        player.interact(goblin);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPlayerInteractWithoutCollision() {
        player.interact(goblin);
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemySettersAndGetters() {
        goblin.setType("Orc");
        assertEquals("Orc", goblin.getType());
        
        goblin.setXPos(2);
        assertEquals(2, goblin.getXPos());
        
        goblin.setYPos(3);
        assertEquals(3, goblin.getYPos());
    }

    @Test
    public void testPlayerSettersAndGetters() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
        
        player.setScore(20);
        assertEquals(20, player.getScore());
        
        player.setXPos(3);
        assertEquals(3, player.getXPos());
        
        player.setYPos(4);
        assertEquals(4, player.getYPos());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlayerInvalidMove() {
        // This tests for large input values that might potentially break the bounds
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEnemyInvalidInitialization() {
        // This tests for initializing with large negative values
        new Enemy("Zombie", Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}

