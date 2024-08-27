// File: Kingdom.java
class Kingdom {
    // Declare fields
    private String kingdomName;
    private int population;
    private double treasury;
    private String rulerName;
    private boolean prosperityStatus;

    // Constructor
    public Kingdom(String kingdomName, int population, double treasury, String rulerName) {
        this.kingdomName = kingdomName;
        this.population = population;
        this.treasury = treasury;
        this.rulerName = rulerName;
        declareProsperous(); // Set the initial prosperity status based on the treasury
    }

    // Getters
    public String getKingdomName() {
        return kingdomName;
    }

    public int getPopulation() {
        return population;
    }

    public double getTreasury() {
        return treasury;
    }

    public String getRulerName() {
        return rulerName;
    }

    public boolean isProsperityStatus() {
        return prosperityStatus;
    }

    // Setters
    public void setKingdomName(String kingdomName) {
        this.kingdomName = kingdomName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setTreasury(double treasury) {
        this.treasury = treasury;
        declareProsperous();
    }

    public void setRulerName(String rulerName) {
        this.rulerName = rulerName;
    }

    // Method to display kingdom's information
    public void displayInfo() {
        System.out.println("Welcome to the Kingdom of " + kingdomName + "!");
        System.out.println("Population: " + population);
        System.out.println("Treasury: $" + treasury + " million");
        System.out.println("Ruled by: " + rulerName);
        System.out.println("Prosperous: " + prosperityStatus);
    }

    // Method to declare prosperity based on treasury
    private void declareProsperous() {
        if (treasury > 5.0) {
            prosperityStatus = true;
        } else {
            prosperityStatus = false;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Kingdom serenia = new Kingdom("Serenia", 2000, 3.5, "Queen Athena");
        serenia.displayInfo();

        serenia.setTreasury(6.0); // Setting treasury above 5 million
        serenia.displayInfo(); // Should reflect prosperity status change
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
        System.out.println("Enemy at (" + xCoordinate + ", " + yCoordinate + ") encountered by " + hero.getName());
        hero.increaseScore(-10); // Decrease score as a consequence of encounter
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
class Game {
    public static void main(String[] args) {
        Hero hero = new Hero("John", 0, 0);
        Enemy enemy = new Enemy(2, 2);
        
        hero.move(2, 2);
        
        enemy.interact(hero);
        
        hero.increaseScore(100);
        
        System.out.println("Hero " + hero.getName() + " at (" + hero.getXCoordinate() + ", " + hero.getYCoordinate() + ") with score: " + hero.getScore());
    }
}