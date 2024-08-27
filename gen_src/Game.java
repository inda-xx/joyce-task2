class Game {

    private int level;

    // Constructor to initialize game level
    public Game() {
        this.level = 1;
    }

    // Method to advance the game level
    public void advanceLevel(int newLevel) {
        // Resolve any variable shadowing issues by using 'this'
        this.level = newLevel;
        System.out.println("Advanced to level: " + this.level);
    }

    // Main method for testing the game functionality
    public static void main(String[] args) {
        // Create a game instance
        Game gameInstance = new Game();
        
        // Advance the game level
        gameInstance.advanceLevel(2);
    }
}
