// File: Player.java
class Player {
    // Instance fields for player attributes
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize player fields
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Initial score set to zero
    }

    // Getter and setter for 'name'
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for 'score'
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for 'positionX'
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and setter for 'positionY'
    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    // Method to move player upwards by increasing positionY
    public void moveUp() {
        positionY++;
        System.out.println(name + " moved up. Current position: (" + positionX + ", " + positionY + ")");
    }

    // Method to move player downwards by decreasing positionY
    public void moveDown() {
        positionY--;
        System.out.println(name + " moved down. Current position: (" + positionX + ", " + positionY + ")");
    }

    // Method to move player left by decreasing positionX
    public void moveLeft() {
        positionX--;
        System.out.println(name + " moved left. Current position: (" + positionX + ", " + positionY + ")");
    }

    // Method to move player right by increasing positionX
    public void moveRight() {
        positionX++;
        System.out.println(name + " moved right. Current position: (" + positionX + ", " + positionY + ")");
    }
}

// File: Enemy.java
class Enemy {
    // Instance fields for enemy attributes
    private int positionX;
    private int positionY;
    private String type;

    // Constructor to initialize enemy fields
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    // Method to interact with the player
    public void interact(Player player) {
        // Check if player and enemy occupy the same position
        if (player.getPositionX() == this.positionX && player.getPositionY() == this.positionY) {
            // Decrease player's score if interaction occurs
            player.setScore(player.getScore() - 10);
            System.out.println(player.getName() + " encountered a " + type + "! Score decreased to " + player.getScore());
        }
    }
}

// File: Game.java
public class Game {
    public static void main(String[] args) {
        // Create a player named 'Hero' at starting position (0,0)
        Player player = new Player("Hero", 0, 0);
        
        // Create enemy instances at specific positions
        Enemy goblin = new Enemy("Goblin", 1, 0);
        Enemy orc = new Enemy("Orc", 0, 1);
        
        // Illustrative movement and interaction examples
        player.moveRight(); // Move player right
        goblin.interact(player); // Check for interaction with goblin

        player.moveDown(); // Move player down
        orc.interact(player); // Check for interaction with orc
    }
}