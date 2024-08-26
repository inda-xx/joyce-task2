class Enemy {
    // Instance fields for Enemy
    private int positionX;
    private int positionY;
    private String type;
    
    // Constructor
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    // Method for interaction with player
    public void interact(Player player) {
        // Check if player position matches enemy position
        // If so, decrease the player's score by 10
        // Print interaction outcome
    }
}

// Game.java
public 