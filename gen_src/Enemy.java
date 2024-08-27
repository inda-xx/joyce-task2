class Enemy {
    // Fields for Enemy class
    private String type;
    private int positionX;
    private int positionY;
    private boolean isDefeated;

    // Constructor for Enemy
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isDefeated = false;
    }

    // Getters
    public String getType() { return type; }
    public int getPositionX() { return positionX; }
    public int getPositionY() { return positionY; }
    public boolean isDefeated() { return isDefeated; }

    // Setters
    public void setType(String type) { this.type = type; }
    public void setPositionX(int positionX) { this.positionX = positionX; }
    public void setPositionY(int positionY) { this.positionY = positionY; }
    public void setDefeated(boolean isDefeated) { this.isDefeated = isDefeated; }

    // Method to interact with player
    public void interactWith(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            player.setAlive(false);
            System.out.println("Game Over! " + player.getName() + " was defeated by an enemy.");
        }
    }
}

// Game.java
public 