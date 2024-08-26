class Game {
    
    // Instance fields
    private Player player;
    private List<Enemy> enemies;
    private int score;
    private int gridSize;
    
    // Constructor
    public Game(int gridSize) {
        this.gridSize = gridSize;
        this.score = 0;
        this.player = new Player();
        this.enemies = new ArrayList<>();
        // Initialize enemies
    }
    
    // Main method
    public static void main(String[] args) {
        Game game = new Game(10);
        // Other game setup actions
    }
    
    // Method to update the score
    public void updateScore(int points) {
        // Update score logic
    }
    
    // Method to check collision between player and enemies
    public void checkCollision() {
        for (Enemy enemy : enemies) {
            if (player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
                System.out.println("Player collided with an enemy!");
                player.setHealth(player.getHealth() - 1);
                enemies.remove(enemy);
                updateScore(10);
                break;
            }
        }
    }
    
    // Additional methods
    // ...
}

// Player.java

public 