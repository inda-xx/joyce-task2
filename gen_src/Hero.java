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
