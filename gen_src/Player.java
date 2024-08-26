class Player {
    // Step 1: Define the private fields for the Player class
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;

    // Step 3: Constructor to initialize the player with a name and position
    public Player(String name, int x, int y) {
        // Initialize fields
    }
    
    // Step 2: Implement getters and setters for each field
    public String getName() {
        // Return player's name
        return null;
    }
    
    public void setName(String name) {
        // Set player's name
    }
    
    public int getX() {
        // Return player's x position
        return 0;
    }
    
    public int getY() {
        // Return player's y position
        return 0;
    }
    
    public void setPosition(int x, int y) {
        // Set player's position
    }
    
    public int getScore() {
        // Return player's score
        return 0;
    }
    
    public void setScore(int score) {
        // Set player's score
    }

    public static void main(String[] args) {
        // Create a Player object
        Player hero = new Player("Hero", 0, 0);
        
        // Set values using setters
        hero.setScore(0);

        // Get and print values using getters
        System.out.println("Player Name: " + hero.getName());
        System.out.println("Position: (" + hero.getX() + ", " + hero.getY() + ")");
        System.out.println("Score: " + hero.getScore());
    }
}

// Enemy.java
