// File: Player.java
class Player {
    // Declare private fields
    private String name;
    private int score;
    private int[] position; // holds x, y coordinates
    private boolean isAlive;

    // Constructor to initialize Player
    public Player(String name, int[] position) {
        this.name = name;
        this.position = position;
        this.score = 0;
        this.isAlive = true;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for position
    public int[] getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(int[] position) {
        this.position = position;
    }

    // Getter for isAlive
    public boolean isAlive() {
        return isAlive;
    }

    // Setter for isAlive
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to interact with an Enemy
    public void interactWithEnemy(Enemy enemy) {
        if (enemy != null && position != null && enemy.getPosition() != null &&
            position.length == 2 && enemy.getPosition().length == 2 &&
            position[0] == enemy.getPosition()[0] && position[1] == enemy.getPosition()[1]) {
            
            if (enemy.isActive()) {
                this.isAlive = false;
                System.out.println("You Lose!");
            } else {
                this.score += 5;
                System.out.println("Score: " + this.score);
            }
        }
    }

    public static void main(String[] args) {
        Player john = new Player("John", new int[]{0, 0});

        // Demonstrate initial state
        john.printInfo();
        
        // Example interaction with enemy
        Enemy goblin = new Enemy("Goblin", new int[]{0, 0}, true); // Active enemy
        john.interactWithEnemy(goblin);
    }

    // Method to print Player's info
    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + position[0] + ", " + position[1] + ")");
        System.out.println("Is Alive: " + isAlive);
    }
}

// File: Enemy.java
class Enemy {
    private String type;
    private int[] position;
    private boolean isActive;

    public Enemy(String type, int[] position, boolean isActive) {
        this.type = type;
        this.position = position;
        this.isActive = isActive;
    }

    public int[] getPosition() {
        return position;
    }

    public boolean isActive() {
        return isActive;
    }

    public void displayType() {
        System.out.println("Enemy Type: " + type);
    }
}

// File: GameShadowing.java
class GameShadowing {
    private int level = 1; // Expecting this level

    public void startNewLevel() {
        int localLevel = 5;
        System.out.println("Current level: " + this.level); // Corrected to use the field level
    }
    
    public static void main(String[] args){
        new GameShadowing().startNewLevel();
    }
}

// Fix the example in GameShadowing class

// Another Example to fix shadowing

public class Enemy {
    private String type;

    public Enemy(String type) {
        this.type = type; // Correctly setting the field type
    }

    public void displayType() {
        System.out.println("Enemy Type: " + this.type); // Now correctly prints the enemy's type
    }
}