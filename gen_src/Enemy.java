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
