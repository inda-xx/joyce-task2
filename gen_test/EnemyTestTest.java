class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 15);
    }

    @Test
    public void testInitialValues() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(15, enemy.getPower());
    }

    @Test
    public void testSetType() {
        enemy.setType("Giant");
        assertEquals("Giant", enemy.getType());
    }

    @Test
    public void testSetPower() {
        enemy.setPower(30);
        assertEquals(30, enemy.getPower());
    }
}