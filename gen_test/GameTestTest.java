class GameTest {
    private Game game;
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero");
        game = new Game("Adventure Game", player);
    }

    @Test
    public void testInitialGameState() {
        assertEquals("Adventure Game", game.getName());
        assertNotNull(game.getEnemies());
    }

    @Test
    public void testAddEnemy() {
        Enemy enemy = new Enemy("Dragon", 50, 2, 3);
        game.addEnemy(enemy);
        List<Enemy> enemies = game.getEnemies();
        assertEquals(1, enemies.size());
        assertEquals("Dragon", enemies.get(0).getType());
    }

    @Test
    public void testRunGameWithQuitCommand() {
        // This test assumes user input can be simulated or the method can be refactored for testability
    }

    @Test
    public void testGameOverCondition() {
        Enemy powerfulEnemy = new Enemy("Lethal Goblin", 200, 0, 0);
        game.addEnemy(powerfulEnemy);
        game.interactWithEnemies();
        assertEquals(0, player.getHealth());
    }
}