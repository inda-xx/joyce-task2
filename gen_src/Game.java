public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 100);
        Enemy enemy = new Enemy("Goblin", 30, 10);
        GameMap gameMap = new GameMap();

        System.out.println("Welcome to the Game!");
        gameMap.updateMapWithPlayer(player);
        gameMap.updateMapWithEnemy(enemy);
        gameMap.printMap();

        player.moveRight();
        player.moveDown();
        if (player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
            enemy.attack(player);
        }
        
        player.increaseScore(10);

        gameMap.updateMapWithPlayer(player);
        gameMap.updateMapWithEnemy(enemy);
        gameMap.printMap();
        
        System.out.println(player.getPlayerName() + " Scores: " + player.getScore());
        System.out.println(player.getPlayerName() + " Health: " + player.getHealth());
    }
}
