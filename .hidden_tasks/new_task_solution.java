// File: Enemy.java
class Enemy {
    // Fields to represent enemy attributes
    private String enemyName;
    private int damage;
    private int[] position;

    // Constructor to initialize an enemy with a name, damage, and position
    public Enemy(String enemyName, int damage, int[] position) {
        this.enemyName = enemyName;
        this.damage = damage;
        this.position = position;
    }

    // Getter and setters for encapsulation
    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public static void main(String[] args) {
        // You can use this method to test the Enemy class
        // For example, create an enemy and print its attributes
        Enemy e1 = new Enemy("Goblin", 15, new int[]{1, 2});
        System.out.println("Enemy Name: " + e1.getEnemyName());
        System.out.println("Damage: " + e1.getDamage());
        System.out.println("Position: (" + e1.getPosition()[0] + ", " + e1.getPosition()[1] + ")");
    }
}

// File: Player.java
class Player {
    // Fields to represent player attributes
    private String playerName;
    private int score;
    private int[] position; // Represents player's position as x and y coordinates
    private boolean isAlive;
    
    // Constructor to initialize a player with a name and starting position
    public Player(String playerName, int[] position) {
        this.playerName = playerName;
        this.position = position;
        this.score = 0; // Default score
        this.isAlive = true; // Default to true, player is alive when created
    }

    // Getter and setters for encapsulation
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    // Method to move the player to a new position
    public void move(int x, int y) {
        // Update the player's position to the new x and y coordinates
        this.position[0] = x;
        this.position[1] = y;
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.position[0] == enemy.getPosition()[0] && this.position[1] == enemy.getPosition()[1]) {
            // If player position matches enemy position, player loses life (set isAlive to false)
            this.isAlive = false;
            // Potentially adjust score. For simplicity, reset score if player dies.
            this.score = 0;  
        }
    }

    public static void main(String[] args) {
        // Create a new player
        Player hero = new Player("Hero", new int[]{0, 0}); // Player starts at position (0,0)

        // Print player information
        System.out.println("Player Name: " + hero.getPlayerName());
        System.out.println("Score: " + hero.getScore());
        System.out.println("Position: (" + hero.getPosition()[0] + ", " + hero.getPosition()[1] + ")");
        System.out.println("Is Alive: " + hero.isAlive());
        
        // Move the player and print new position
        hero.move(5, 3);
        System.out.println("New Position: (" + hero.getPosition()[0] + ", " + hero.getPosition()[1] + ")");
        
        // Create an enemy and make the player interact with it
        Enemy villain = new Enemy("Villain", 10, new int[]{0, 0});
        hero.interactWithEnemy(villain);
        System.out.println("Player Lives: " + hero.isAlive());
    }
}