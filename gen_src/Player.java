class Player {
    // Fields
    private String name;
    private int score;
    private int health;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.score = 0; // Initialize score
        this.health = 100; // Initialize with full health
        this.xPosition = 0; // Starting x position
        this.yPosition = 0; // Starting y position
    }
    
    // Methods for player movement
    public void moveUp() {
        // Logic for moving up
    }

    public void moveDown() {
        // Logic for moving down
    }

    public void moveLeft() {
        // Logic for moving left
    }

    public void moveRight() {
        // Logic for moving right
    }

    // Print player info
    public void printInfo() {
        // Print player's current state and position
    }

    // Getters and Setters for encapsulation
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // Implement other getters/setters for health, xPosition, yPosition
}

// Enemy.java
public 