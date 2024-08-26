class Enemy {
    // Define fields for enemy's position (add more fields if necessary)
    private int xPosition;
    private int yPosition;

    // Constructor to initialize the enemy's position
    public Enemy(int x, int y) {
        // Initialize enemy's position
    }
    
    // Method to interact with a Player
    public void interact(Player player) {
        // Example interaction: decrease player's score
        player.setScore(player.getScore() - 10);
        System.out.println(player.getName() + " encountered an enemy! Score: " + player.getScore());
    }
}

// Game.java
public 