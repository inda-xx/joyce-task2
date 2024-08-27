// File: ShadowExample.java
class ShadowExample {
    private String name;

    public ShadowExample(String name) {
        this.name = name; // Using 'this' to refer to the instance variable
    }

    public void printName() {
        String name = "Temporary Name";
        System.out.println(this.name); // Using 'this' to print the instance variable
    }

    public static void main(String[] args) {
        new ShadowExample("Real Name").printName();
    }
}

// File: Character.java
class Character {
    // Fields for character attributes
    private String name;
    private int age;
    private String type; // e.g., 'Warrior', 'Mage', etc.
    private int strength;
    private int intelligence;
    private boolean isActive;

    // Constructor to initialize all fields
    public Character(String name, int age, String type, int strength, int intelligence, boolean isActive) {
        // Use 'this' to refer to instance variables
        this.name = name;
        this.age = age;
        this.type = type;
        this.strength = strength;
        this.intelligence = intelligence;
        this.isActive = isActive;
    }

    // Getters and Setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Method to print character details to the console
    public void printDetails() {
        System.out.println("Character Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Active: " + isActive);
    }

    // Method to simulate a battle between this character and another
    public void battle(Character opponent) {
        int thisPower = this.strength + this.intelligence;
        int opponentPower = opponent.getStrength() + opponent.getIntelligence();

        System.out.println(this.name + " battles " + opponent.getName() + "!");
        if (thisPower > opponentPower) {
            System.out.println(this.name + " is likely to win the battle.");
        } else if (thisPower < opponentPower) {
            System.out.println(opponent.getName() + " is likely to win the battle.");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Main method to test your Character class
    public static void main(String[] args) {
        // Create two characters using the constructor
        Character warrior = new Character("Aragorn", 87, "Warrior", 10, 8, true);
        Character mage = new Character("Gandalf", 2019, "Mage", 5, 10, true);

        // Print details of characters
        warrior.printDetails();
        mage.printDetails();

        // Simulate a battle
        warrior.battle(mage);
    }
}

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