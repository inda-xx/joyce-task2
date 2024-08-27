class Player {
    // Declare instance fields
    private String name;
    private int score;
    private int xPos;
    private int yPos;

    // Constructor to initialize player fields
    public Player(String name, int x, int y) {
        this.name = name;
        this.score = 0; // Initial score is 0
        this.xPos = x;
        this.yPos = y;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for xPos
    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    // Getter and setter for yPos
    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        // Update player's current position
        this.xPos += deltaX;
        this.yPos += deltaY;
    }

    // Method to interact with an enemy
    public void interact(Enemy enemy) {
        // Check for collision with the enemy
        if (this.xPos == enemy.getXPos() && this.yPos == enemy.getYPos()) {
            System.out.println(this.name + " has encountered a " + enemy.getType() + "!");
            // Update score or other interaction logic
        }
    }
}

// Enemy.java
public 