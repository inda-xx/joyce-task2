// File: Game.java
class Game {
    public static void main(String[] args) {
        // Create Player and Enemy instances
        Player player = new Player("HeroName");
        Enemy enemy = new Enemy("Goblin", 2, 2);

        // Simulate player movements
        player.move(1, 1);  // Player moved to (1, 1)
        player.move(1, 1);  // Player moved to (2, 2)

        // Simulate player interaction with the enemy
        enemy.interactWith(player); // Game Over! HeroName was defeated by an enemy.

        // Demonstrate variable shadowing
        player.setName("NewHeroName");
        player.setPosition(player.getPositionX(), player.getPositionY());
    }
}

// File: Player.java
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
}

// File: Enemy.java
class Enemy {
    // Fields for Enemy class
    private String type;
    private int positionX;
    private int positionY;
    private boolean isDefeated;

    // Constructor for Enemy
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isDefeated = false;
    }

    // Getters
    public String getType() { return type; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public boolean isDefeated() { return isDefeated; }

    // Setters
    public void setType(String type) { this.type = type; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
    public void setDefeated(boolean isDefeated) { this.isDefeated = isDefeated; }

    // Method to interact with player
    public void interactWith(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            player.setAlive(false);
            System.out.println("Game Over! " + player.getName() + " was defeated by an enemy.");
        }
    }
}