// File: GameCharacter.java
class GameCharacter {

    // Define private fields for the GameCharacter class
    private String name;
    private int healthPoints;
    private int score;
    private boolean isEnemy;

    // Constructor to initialize all fields
    public GameCharacter(String name, int healthPoints, int score, boolean isEnemy) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.score = score;
        this.isEnemy = isEnemy;
    }

    // Getter for the name field
    public String getName() {
        return name;
    }

    // Setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the healthPoints field
    public int getHealthPoints() {
        return healthPoints;
    }

    // Setter for the healthPoints field
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    // Getter for the score field
    public int getScore() {
        return score;
    }

    // Setter for the score field
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for the isEnemy field
    public boolean getIsEnemy() {
        return isEnemy;
    }

    // Setter for the isEnemy field
    public void setIsEnemy(boolean isEnemy) {
        this.isEnemy = isEnemy;
    }

    // Method to move the player in a specified direction
    public void movePlayer(String direction) {
        // Print the action of moving in the specified direction
        System.out.println(name + " moves " + direction);
    }

    // Method to interact with another character
    public void interact(GameCharacter otherCharacter) {
        // Check if the other character is an enemy
        if (otherCharacter.getIsEnemy()) {
            // Interact logic, e.g., decreasing health points
            System.out.println(name + " encounters an enemy: " + otherCharacter.getName());
            this.healthPoints -= 10; // Example of decreasing healthPoints
            System.out.println("Health now: " + this.healthPoints);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a player character
        GameCharacter player = new GameCharacter("Adventurer", 100, 0, false);

        // Create an enemy character
        GameCharacter enemy = new GameCharacter("Goblin", 30, 0, true);

        // Interact with the enemy
        player.interact(enemy);

        // Move the player
        player.movePlayer("north");
    }
}

// File: Game.java
class Game {

    private int level;

    // Constructor to initialize game level
    public Game() {
        this.level = 1;
    }

    // Method to advance the game level
    public void advanceLevel(int newLevel) {
        // Resolve any variable shadowing issues by using 'this'
        this.level = newLevel;
        System.out.println("Advanced to level: " + this.level);
    }

    // Main method for testing the game functionality
    public static void main(String[] args) {
        // Create a game instance
        Game gameInstance = new Game();
        
        // Advance the game level
        gameInstance.advanceLevel(2);
    }
}