// File: City.java
class City {
    // Fields to define the City attributes
    private String name;
    private int population;
    private double area;
    private boolean capital;

    // Constructor to initialize a City object
    public City(String name, int population, double area, boolean capital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
    }

    // Getter and setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    // Method to print city information
    public void printInfo() {
        System.out.println("City Information:");
        System.out.println("Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("Area: " + area + " sq km");
        System.out.println("Capital City: " + (capital ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Create a City object using the constructor
        City stockholm = new City("Stockholm", 975551, 188.0, true);

        // Print city details using the printInfo() method
        stockholm.printInfo();
    }
}

// File: ShadowExample.java
class ShadowExample {
    private int population = 1000; // Instance level variable

    // Method demonstrating variable shadowing
    public void printShadow() {
        int population = 2000; // Local variable shadowing instance variable
        System.out.println(population); // Prints the local variable
        System.out.println(this.population); // Prints the instance variable, using "this" keyword
    }

    public static void main(String[] args){
        new ShadowExample().printShadow();
    }
}

// File: Building.java
class Building {
    private String color; // Instance field for storing color

    // Constructor to initialize Building object
    public Building(String color) {
        this.color = color; // Correctly assigns the parameter to the instance variable
    }

    // Method demonstrating shadowing and using class-level variable
    public void describe() {
        String color = "Green"; // Local variable shadowing instance variable
        System.out.println("The local variable color is " + color); // Prints the local variable
        System.out.println("The building color is " + this.color); // Prints the instance variable using "this" keyword
    }

    public static void main(String[] args){
        Building building = new Building("Red");
        building.describe();
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

        // Demonstrate interaction
        hero.move(1, 1);
        if (hero.getXCoordinate() == enemy.getXCoordinate() && hero.getYCoordinate() == enemy.getYCoordinate()) {
            enemy.interact(hero);
        }

        // Print Hero's score
        System.out.println("Hero's Score after encounter: " + hero.getScore());
    }
}