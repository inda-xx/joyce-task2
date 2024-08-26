class Game {
    public static void main(String[] args) {
        // Instantiate a Player object
        Player player = new Player("Hero", 0, 0);
        
        // Instantiate Enemy objects
        Enemy goblin = new Enemy("Goblin", 1, 0);
        Enemy orc = new Enemy("Orc", 0, 1);
        
        // Example of player movement and interaction
        // Move the player to the right
        player.moveRight();
        
        // Have the goblin interact with the player
        goblin.interact(player);
        
        // Move the player down
        player.moveDown();
        
        // Have the orc interact with the player
        orc.interact(player);
        
        // Implement additional game logic as required
    }
}