class Player {
    // Instance fields for Player
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    
    // Constructor
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Initial score
    }
    
    // Getters and setters for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getters and setters for score
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    // Getters and setters for positionX
    public int getPositionX() {
        return positionX;
    }
    
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    
    // Getters and setters for positionY
    public int getPositionY() {
        return positionY;
    }
    
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    // Methods for moving the player
    public void moveUp() {
        // Increment positionY to move up
        positionY++;
        // Print the current position
    }
    
    public void moveDown() {
        // Decrement positionY to move down
        positionY--;
        // Print the current position
    }
    
    public void moveLeft() {
        // Decrement positionX to move left
        positionX--;
        // Print the current position
    }
    
    public void moveRight() {
        // Increment positionX to move right
        positionX++;
        // Print the current position
    }
}

// Enemy.java
public 