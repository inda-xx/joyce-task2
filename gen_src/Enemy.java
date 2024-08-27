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
        // Implement logic to affect hero's state
        System.out.println("Enemy at (" + xCoordinate + ", " + yCoordinate + ") encountered by " + hero.getName());
        // Move enemy to a new position or affect hero
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

// Game.java
public 