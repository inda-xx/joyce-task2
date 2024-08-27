// File: Hero.java
class Hero {
    private String name;
    private int xCoordinate;
    private int yCoordinate;
    private int score;
    
    // Constructor to initialize Hero fields
    public Hero(String name, int x, int y) {
        this.name = name;
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.score = 0; // Initial score is 0
    }
    
    // Method to move the hero by dx and dy
    public void move(int dx, int dy) {
        xCoordinate += dx;
        yCoordinate += dy;
    }
    
    // Method to increase the hero's score
    public void increaseScore(int points) {
        score += points;
    }
    
    // Getters and setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

// File: Enemy.java
class Enemy {
    private int xCoordinate;
    private int yCoordinate;
    
    // Constructor to initialize Enemy fields
    public Enemy(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
    
    // Method to simulate interaction with hero
    public void interact(Hero hero) {
        // For example, encounter decreases hero's score by 10
        System.out.println("Enemy at (" + xCoordinate + ", " + yCoordinate + ") encountered by " + hero.getName());
        hero.increaseScore(-10); // Decrease score as a consequence of encounter
        // Could also teleport the enemy or change its state
    }
    
    // Getters and setters for encapsulation
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}

// File: Game.java
public class Game {
    public static void main(String[] args) {
        // Create a new Hero with a name and initial coordinates
        Hero hero = new Hero("John", 0, 0);

        // Create an Enemy at specific coordinates
        Enemy enemy = new Enemy(2, 2);
        
        // Move the hero to a new position
        hero.move(2, 2);
        
        // Interact with the enemy
        enemy.interact(hero);
        
        // Increase the hero's score
        hero.increaseScore(100);
        
        // Print the hero's updated information
        System.out.println("Hero " + hero.getName() + " at (" + hero.getXCoordinate() + ", " + hero.getYCoordinate() + ") with score: " + hero.getScore());
    }
}