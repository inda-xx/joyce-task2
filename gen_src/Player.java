class Player {
    // Declare private fields
    private String name;
    private int score;
    private int[] position; // holds x, y coordinates
    private boolean isAlive;

    // Constructor to initialize Player
    public Player(String name, int[] position) {
        this.name = name;
        this.position = position;
        this.score = 0;
        this.isAlive = true;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for position
    public int[] getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(int[] position) {
        this.position = position;
    }

    // Getter for isAlive
    public boolean isAlive() {
        return isAlive;
    }

    // Setter for isAlive
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to interact with an Enemy
    public void interactWithEnemy(Enemy enemy) {
        // Logic to check if positions match and respond to enemy's activity status
        // if the enemy isActive, player loses; else, player gains points
    }

    public static void main(String[] args) {
        Player john = new Player("John", new int[]{0, 0});

        // Demonstrate initial state
        john.printInfo();
        
        // Example interaction with enemy
        Enemy goblin = new Enemy("Goblin", new int[]{0, 0}, true); // Active enemy
        john.interactWithEnemy(goblin);
    }

    // Method to print Player's info
    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + position[0] + ", " + position[1] + ")");
        System.out.println("Is Alive: " + isAlive);
    }
}

// Enemy.java

