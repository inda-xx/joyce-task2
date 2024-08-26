class Player {
    // Fields to represent player attributes
    private String playerName;
    private int score;
    private int[] position; // Represents player's position as x and y coordinates
    private boolean isAlive;
    
    // Constructor to initialize a player with a name and starting position
    public Player(String playerName, int[] position) {
        this.playerName = playerName;
        this.position = position;
        this.score = 0; // Default score
        this.isAlive = true; // Default to true, player is alive when created
    }

    // Getter and setters for encapsulation
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    // Method to move the player to a new position
    public void move(int x, int y) {
        // Update the player's position to the new x and y coordinates
        this.position[0] = x;
        this.position[1] = y;
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        // Implement logic to handle player and enemy interaction
        // For example, reduce player's life if positions match
    }

    public static void main(String[] args) {
        // Create a new player
        Player hero = new Player("Hero", new int[]{0, 0}); // Player starts at position (0,0)

        // Print player information
        System.out.println("Player Name: " + hero.getPlayerName());
        System.out.println("Score: " + hero.getScore());
        System.out.println("Position: (" + hero.getPosition()[0] + ", " + hero.getPosition()[1] + ")");
        System.out.println("Is Alive: " + hero.isAlive());
        
        // Move the player and print new position
        hero.move(5, 3);
        System.out.println("New Position: (" + hero.getPosition()[0] + ", " + hero.getPosition()[1] + ")");
    }
}

// Enemy.java

