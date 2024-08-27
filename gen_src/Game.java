class Game {
    public static void main(String[] args) {
        // Create player and enemy objects
        Player player = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 1, 0);

        // Simulate player movement
        player.move(1, 0); // Move player position

        // Simulate interaction with the enemy
        player.interact(goblin);

        // Print player's score
        System.out.println("Score: " + player.getScore());
    }
}