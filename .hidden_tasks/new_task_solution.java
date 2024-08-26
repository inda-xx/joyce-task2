import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Player {

    // Fields
    private String name;
    private int health;
    private int attackPoints;
    private int defensePoints;
    private boolean defeated;
    
    // Constructor
    public Player(String name, int health, int attackPoints, int defensePoints) {
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.defeated = false;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getAttackPoints() {
        return attackPoints;
    }
    
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    
    public int getDefensePoints() {
        return defensePoints;
    }
    
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }
    
    public boolean isDefeated() {
        return defeated;
    }
    
    public void setDefeated(boolean defeated) {
        this.defeated = defeated;
    }
    
    // Movement methods
    public void moveForward() {
        System.out.println(name + " moves forward.");
    }
    
    public void moveBack() {
        System.out.println(name + " moves backward.");
    }
    
    // Method to attack an opponent
    public void attack(Enemy opponent) {
        int damage = this.attackPoints - opponent.getDefensePoints();
        if (damage < 0) damage = 0; // Prevent negative damage
        
        opponent.setHealth(opponent.getHealth() - damage);
        System.out.println(this.name + " attacks " + opponent.getName() + " for " + damage + " damage!");

        if (opponent.getHealth() <= 0) {
            opponent.setDefeated(true);
            System.out.println(opponent.getName() + " has been defeated!");
        }
    }
    
    // Method to print player info
    public void printInfo() {
        System.out.println("Player Info: " + name + ", Health: " + health + ", Attack: " + attackPoints + ", Defense: " + defensePoints);
    }
}

class Enemy {

    // Fields
    private String name;
    private int health;
    private int attackPoints;
    private int defensePoints;
    private boolean defeated;

    // Constructor
    public Enemy(String name, int health, int attackPoints, int defensePoints) {
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.defeated = false;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getAttackPoints() {
        return attackPoints;
    }
    
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    
    public int getDefensePoints() {
        return defensePoints;
    }
    
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }
    
    public boolean isDefeated() {
        return defeated;
    }
    
    public void setDefeated(boolean defeated) {
        this.defeated = defeated;
    }

    // Method to attack an opponent
    public void attack(Player player) {
        int damage = this.attackPoints - player.getDefensePoints();
        if (damage < 0) damage = 0; // Prevent negative damage

        player.setHealth(player.getHealth() - damage);
        System.out.println(this.name + " attacks " + player.getName() + " for " + damage + " damage!");

        if (player.getHealth() <= 0) {
            player.setDefeated(true);
            System.out.println(player.getName() + " has been defeated!");
        }
    }

    // Method to print enemy info
    public void printInfo() {
        System.out.println("Enemy Info: " + name + ", Health: " + health + ", Attack: " + attackPoints + ", Defense: " + defensePoints);
    }
}

public class Game {

    public static void main(String[] args) {
        // Create player and enemy objects
        Player player = new Player("Hero", 100, 10, 5);
        Enemy enemy = new Enemy("Villain", 80, 8, 3);
        
        // Initialize score
        int score = 0;
        
        // Game logic
        player.moveForward();
        score += 10;
        System.out.println("Current Score: " + score);

        player.attack(enemy);

        if (!enemy.isDefeated()) {
            enemy.attack(player);
        }

        player.moveBack();
        score -= 5;
        System.out.println("Current Score: " + score);

        player.printInfo();
        enemy.printInfo();
    }
}