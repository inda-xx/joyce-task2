class Game {

    private int level;

    public Game() {
        this.level = 1; // Initial game level
    }

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