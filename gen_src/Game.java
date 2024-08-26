class Game {
    // Fields
    private Player player;
    private Enemy enemy;

    // Constructor
    public Game(Player player, Enemy enemy) {
        // Initialize the game with a player and an enemy
    }

    // Methods
    public void runGame() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Loop to allow player movement and interaction with enemy
        while (true) {
            // Print player status
            player.printStatus();

            // Ask for player movement input (x y)
            System.out.println("Enter move direction (x y): ");

            // Read input values (deltaX, deltaY)
            int deltaX = scanner.nextInt(); // Placeholder input
            int deltaY = scanner.nextInt(); // Placeholder input
            
            // Move the player
            player.move(deltaX, deltaY);

            // Check for collision with the enemy
            if (enemy.isCollided(player)) {
                // Notify user about the collision and update player's score
                player.setScore(player.getScore() + 10);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate player and enemy objects
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin", 1, 1);

        // Instantiate the game
        Game game = new Game(player, enemy);

        // Run the game
        game.runGame();
    }
}