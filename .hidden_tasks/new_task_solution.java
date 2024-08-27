// File: Enemy.java
public class Enemy {
    // Fields for enemy attributes
    private String type;
    private int positionX;
    private int positionY;
    private int damage;

    // Constructor to initialize enemy with a type and damage
    public Enemy(String type, int damage) {
        this.type = type;
        this.damage = damage;
        this.positionX = (int) (Math.random() * 100); // Random initial position
        this.positionY = (int) (Math.random() * 100);
    }

    // Getter methods for type
    public String getType() { return type; }

    // Getter methods for damage
    public int getDamage() { return damage; }

    // Getter methods for positionX
    public int getPositionX() { return positionX; }

    // Getter methods for positionY
    public int getPositionY() { return positionY; }

    // Main method to test the Enemy class
    public static void main(String[] args) {
        // Create an enemy object
        Enemy enemy = new Enemy("Orc", 10);

        // Test enemy methods
        System.out.println("Enemy type: " + enemy.getType());
        System.out.println("Enemy position: (" + enemy.getPositionX() + ", " + enemy.getPositionY() + ")");
        System.out.println("Enemy damage: " + enemy.getDamage());
    }
}

// File: Player.java
public class Player {
    // Fields for player attributes
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize player with a name and default values for other fields
    public Player(String name) {
        this.name = name;
        this.score = 0; // Starting score
        this.positionX = 0; // Starting position
        this.positionY = 0;
    }

    // Getter and Setter methods for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Getter and Setter methods for score
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // Getter and Setter methods for positionX
    public int getPositionX() { return positionX; }
    public void setPositionX(int positionX) { this.positionX = positionX; }

    // Getter and Setter methods for positionY
    public int getPositionY() { return positionY; }
    public void setPositionY(int positionY) { this.positionY = positionY; }

    // Method to increase player's score
    public void increaseScore(int points) {
        this.score += points;
    }

    // Method to print player's information
    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    // Method to move the player in a direction
    public void move(String direction) {
        // Implement movement logic based on the direction
        switch (direction.toLowerCase()) {
            case "up":
                positionY++;
                break;
            case "down":
                positionY--;
                break;
            case "left":
                positionX--;
                break;
            case "right":
                positionX++;
                break;
            default:
                System.out.println("Invalid move!");
                break;
        }
        System.out.println("Player moved " + direction + ". New position: (" + positionX + ", " + positionY + ")");
    }

    // Method to interact with an enemy
    public void interact(Enemy enemy) {
        // Calculate distance and interact with enemy if within distance
        if (Math.abs(this.positionX - enemy.getPositionX()) <= 1 && 
            Math.abs(this.positionY - enemy.getPositionY()) <= 1) {
            this.score -= enemy.getDamage();
            System.out.println("Hit by " + enemy.getType() + "! Score decreased to: " + this.score);
        }
    }

    // Main method to test the Player class
    public static void main(String[] args) {
        // Create a player object
        Player player = new Player("Hero");

        // Test player methods
        player.move("up");
        player.increaseScore(10);
        player.printInfo();

        // Interact with an enemy
        Enemy enemy = new Enemy("Goblin", 5);
        player.interact(enemy);

        // Print player info
        player.printInfo();
    }
}