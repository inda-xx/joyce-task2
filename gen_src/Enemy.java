class Enemy {
    // Fields for enemy's position
    private int xPosition;
    private int yPosition;

    // Constructor to initialize the enemy's position
    public Enemy(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }
    
    // Method to interact with a Player
    public void interact(Player player) {
        // Example interaction: decrease player's score
        player.setScore(player.getScore() - 10);
        System.out.println(player.getName() + " encountered an enemy! Score: " + player.getScore());
    }
}
