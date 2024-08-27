class Game {
    // Main method to simulate the game
    public static void main(String[] args) {
        // Create instances of the Player and Enemy classes
        Player player = new Player("Hero", 100);
        Enemy enemy1 = new Enemy("Orc", 20);
        Enemy enemy2 = new Enemy("Goblin", 10);

        // Print initial information about player and enemies
        player.printInfo();
        enemy1.printInfo();
        enemy2.printInfo();

        // Simulate game actions such as player movement and attacks
        player.move(5, 7); // Move player to a new position
        player.attack(enemy1); // Player attacks the first enemy
        player.attack(enemy2); // Player attacks the second enemy

        // Print final player information after all actions
        player.printInfo();
    }
}

// ShadowExample.java
public 