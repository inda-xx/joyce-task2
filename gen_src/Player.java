class Player {
    // Fields for Player class
    private String name;
    private int positionX; 
    private int positionY;
    private int score;
    private boolean isAlive;

    // Constructor for Player
    public Player(String name) {
        this.name = name;
        this.positionX = 0;
        this.positionY = 0;
        this.score = 0;
        this.isAlive = true;
    }

    // Getters
    public String getName() { return name; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public int getScore() { return score; }
    public boolean isAlive() { return isAlive; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
    public void setScore(int score) { this.score = score; }
    public void setAlive(boolean isAlive) { this.isAlive = isAlive; }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println("Player moved to (" + this.positionX + ", " + this.positionY + ")");
    }

    // Method to add score
    public void addScore(int points) {
        this.score += points;
        System.out.println("New score: " + this.score);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Instantiate Player objects and test methods here.
    }
}

// Enemy.java
public 