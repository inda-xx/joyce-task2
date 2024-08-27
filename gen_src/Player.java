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

// Enemy.java
public 