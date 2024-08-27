// File: SpaceExplorer.java
class SpaceExplorer {
    
    // Declare private fields
    private String name;
    private int health;
    private int energy;
    private int speed;
    private boolean active;

    // Constructor to initialize the fields
    public SpaceExplorer(String name, int health, int energy, int speed) {
        // Initialize instance fields using constructor parameters
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.speed = speed;
        this.active = true; // Default value for active
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for energy
    public int getEnergy() {
        return energy;
    }

    // Setter for energy
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Setter for speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter for active - naming convention for boolean isActive()
    public boolean isActive() {
        return active;
    }

    // Setter for active
    public void setActive(boolean active) {
        this.active = active;
    }

    // Method to activate boost
    public void activateBoost() {
        if (energy > 50) {
            speed += speed / 5; // 20% boost in speed
            energy -= 20; // Reduce energy by 20
            System.out.println(name + " activated boost! Speed is now " + speed + " and energy is " + energy + ".");
        } else {
            System.out.println("Not enough energy to activate boost.");
        }
    }

    // Method to print SpaceExplorer info
    public void printInfo() {
        System.out.println("SpaceExplorer Information:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Speed: " + speed);
        System.out.println("Active: " + active);
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create a new SpaceExplorer object
        SpaceExplorer nova = new SpaceExplorer("Nova", 100, 80, 10);
        nova.printInfo(); // Print initial info

        // Activate boost and print info
        nova.activateBoost();
        nova.printInfo();
    }
}

// File: ShadowExample.java
public class ShadowExample {
    private int shadowedNumber = 10;

    public void demonstrateShadowing() {
        int shadowedNumber = 5;
        System.out.println(this.shadowedNumber);
    }

    public static void main(String[] args){
        new ShadowExample().demonstrateShadowing();
    }
}

// File: Starship.java
public class Starship {
    private String model;
    private int year;

    public Starship(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void salute() {
        System.out.println(this.model + " salutes!");
    }

    public static void main(String[] args) {
        Starship enterprise = new Starship("Enterprise", 2024);
        enterprise.salute();
    }
}