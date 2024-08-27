class Game {
    public static void main(String[] args) {
        // Create Player and Enemy instances
        Player player = new Player("HeroName");
        Enemy enemy = new Enemy("Goblin", 2, 2);

        // Use Player object to simulate movements
        player.move(1, 1);
        
        // Simulate player interaction with the enemy
        enemy.interactWith(player);

        // Demonstrate variable shadowing
        player.setName("NewHeroName");
        player.setPosition(player.getPositionX(), player.getPositionY());
    }
}