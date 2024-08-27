class Enemy {
    // Define the fields for the Enemy class
    private String type;
    private int power;

    // Constructor to initialize Enemy with type and power
    public Enemy(String type, int power) {
        this.type = type;
        this.power = power;
    }

    // Getters and setters for each field
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Method to print enemy info to terminal
    public void printInfo() {
        System.out.println("Enemy: " + type);
        System.out.println("Power: " + power + "\n");
    }
}

// Game.java
public 