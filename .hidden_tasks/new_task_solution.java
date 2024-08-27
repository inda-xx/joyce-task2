// File: ShadowExample.java
class ShadowExample {
    // Field to demonstrate shadowing
    private int count;

    // Constructor that correctly assigns the count field
    public ShadowExample(int count) {
        this.count = count; // Using 'this' to refer to the instance variable
    }

    // Method to demonstrate variable shadowing
    public void printShadow() {
        int count = 5; // Local variable with the same name as the instance variable
        System.out.println(this.count); // Use 'this' to reference the instance variable
    }
}

// File: Game.java
public class Game {
    // Main method to simulate the game
    public static void main(String[] args) {
        // Create instances of the Player and Enemy classes
        Player player = new Player("Hero", 100);
        Enemy enemy1 = new Enemy("Orc", 20);
        Enemy enemy2 = new Enemy("Goblin", 10);

        // Print initial information about player and enemies
        player.printInfo();
        enemy1.printInfo();
        enemy2.printInfo();

        // Simulate game actions such as player movement and attacks
        player.move(5, 7); // Move player to a new position
        player.attack(enemy1); // Player attacks the first enemy
        player.attack(enemy2); // Player attacks the second enemy

        // Print final player information after all actions
        player.printInfo();
    }
}

// File: Enemy.java
class Enemy {
    // Define the fields for the Enemy class
    private String type;
    private int power;

    // Constructor to initialize Enemy with type and power
    public Enemy(String type, int power) {
        this.type = type;
        this.power = power;
    }

    // Getters and setters for each field
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Method to print enemy info to terminal
    public void printInfo() {
        System.out.println("Enemy: " + type);
        System.out.println("Power: " + power + "\n");
    }
}

// File: Player.java
class Player {
    // Define the fields for the Player class
    private String name;
    private int score;
    private int health;

    // Constructor to initialize Player with name and health. Initial score is 0.
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0; // Initial score
    }

    // Getters and setters for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to print player info to terminal
    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Health: " + health + "\n");
    }

    // Method to simulate player movement
    public void move(int dx, int dy) {
        // Implement logic to update player position based on dx, dy
        System.out.println(name + " moved to position (" + dx + ", " + dy + ")");
    }

    // Method to perform an attack on an enemy
    public void attack(Enemy enemy) {
        // Implement attack logic
        int damage = enemy.getPower() / 2; // Example damage calculation
        this.health -= damage;
        System.out.println(name + " attacked by " + enemy.getType() + " for " + damage + " damage!");

        // Adjust health and score based on attack outcome
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            score += 10; // Increase score as appropriate
            System.out.println(name + " scored 10 points! Total score: " + score);
        }

        // Print player's current info after attack
        printInfo();
    }
}