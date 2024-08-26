class Game {
    public static void main(String[] args) {
        // Create instances of Player, Enemy, and GameMap
        Player player = new Player("Hero", 0, 100);
        Enemy enemy = new Enemy("Goblin", 30, 10);
        GameMap gameMap = new GameMap();

        // Game logic
        System.out.println("Welcome to the Game!");

        // Example interactions
        player.moveUp();
        enemy.attack(player);
        gameMap.printMap();

        System.out.println(player.getPlayerName() + " Scores: " + player.getScore());
    }
}