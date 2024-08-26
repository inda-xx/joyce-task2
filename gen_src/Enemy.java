class Enemy {
    // Fields
    private String type;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String type, int positionX, int positionY) {
        // Initialize the enemy with a type and position
    }

    // Getters and Setters
    public String getType() {
        // Return the enemy's type
        return null; // Placeholder return
    }

    public void setType(String type) {
        // Set the enemy's type
    }

    public int getPositionX() {
        // Return the enemy's position on the X axis
        return 0; // Placeholder return
    }

    public void setPositionX(int positionX) {
        // Set the enemy's position on the X axis
    }

    public int getPositionY() {
        // Return the enemy's position on the Y axis
        return 0; // Placeholder return
    }

    public void setPositionY(int positionY) {
        // Set the enemy's position on the Y axis
    }

    // Methods
    public boolean isCollided(Player player) {
        // Check if the enemy's position matches the player's position
        return false; // Placeholder return
    }
}

// Game.java
import java.util.Scanner;

public 