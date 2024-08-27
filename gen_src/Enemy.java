class Enemy {
    // Declare instance fields
    private String type;
    private int xPos;
    private int yPos;

    // Constructor to initialize enemy fields
    public Enemy(String type, int x, int y) {
        this.type = type;
        this.xPos = x;
        this.yPos = y;
    }

    // Getter and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and setter for xPos
    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    // Getter and setter for yPos
    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }
}

// Game.java
public 