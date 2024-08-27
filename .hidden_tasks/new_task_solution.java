// File: Game.java
class Game {
    public static void main(String[] args) {
        // Create a Player object
        Player hero = new Player("Hero", 0, 0);
        
        // Create an Enemy object
        Enemy badGuy = new Enemy(5, 5);
        
        // Simulate player reaching enemy
        hero.setPosition(5, 5);
        badGuy.interact(hero);

        // Display final score
        System.out.println("Final Score: " + hero.getScore());
    }
}

// File: Enemy.java
class Enemy {
    // Fields for enemy's position
    private int xPosition;
    private int yPosition;

    // Constructor to initialize the enemy's position
    public Enemy(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }
    
    // Method to interact with a Player
    public void interact(Player player) {
        // Example interaction: decrease player's score
        player.setScore(player.getScore() - 10);
        System.out.println(player.getName() + " encountered an enemy! Score: " + player.getScore());
    }
}

// File: Player.java
class Player {
    // Step 1: Define the private fields for the Player class
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;

    // Step 3: Constructor to initialize the player with a name and position
    public Player(String name, int x, int y) {
        this.name = name;
        this.xPosition = x;
        this.yPosition = y;
        this.score = 0;
    }
    
    // Step 2: Implement getters and setters for each field
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getX() {
        return xPosition;
    }
    
    public int getY() {
        return yPosition;
    }
    
    public void setPosition(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public static void main(String[] args) {
        // Create a Player object
        Player hero = new Player("Hero", 0, 0);
        
        // Set values using setters
        hero.setScore(0);

        // Get and print values using getters
        System.out.println("Player Name: " + hero.getName());
        System.out.println("Position: (" + hero.getX() + ", " + hero.getY() + ")");
        System.out.println("Score: " + hero.getScore());
    }
}