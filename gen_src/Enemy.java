class Enemy {
    // Fields
    private String type;
    private int strength;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Enemy(String type, int strength, int x, int y) {
        this.type = type;
        this.strength = strength;
        this.xPosition = x;
        this.yPosition = y;
    }
    
    // Method for interaction with player
    public void interact(Player player) {
        // Define interaction logic here
    }

    // Getters and Setters for encapsulation
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    // Implement other getters/setters for xPosition, yPosition
}

// Game.java
import java.util.ArrayList;
import java.util.List;

public 