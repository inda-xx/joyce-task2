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

// ShadowExample.java

public 