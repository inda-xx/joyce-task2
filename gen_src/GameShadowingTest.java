class GameShadowingTest {
    
    @Test
    public void testStartNewLevel() {
        GameShadowing gameShadowing = new GameShadowing();
        gameShadowing.startNewLevel();
        assertEquals(1, gameShadowing.level); // Assert that the 