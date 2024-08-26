// File: Player.java
class Player {
    private String playerName;
    private int score;
    private int health;
    private int xPosition;
    private int yPosition;

    public Player(String playerName, int initialScore, int initialHealth) {
        this.playerName = playerName;
        this.score = initialScore;
        this.health = initialHealth;
        this.xPosition = 0; // Start at the top-left of the map
        this.yPosition = 0;
    }

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void moveUp() {
        if (yPosition > 0) {
            yPosition--;
        }
    }

    public void moveDown() {
        if (yPosition < 4) {
            yPosition++;
        }
    }

    public void moveLeft() {
        if (xPosition > 0) {
            xPosition--;
        }
    }

    public void moveRight() {
        if (xPosition < 4) {
            xPosition++;
        }
    }

    public void encounterEnemy(int damage) {
        this.health -= damage;
        System.out.println(playerName + " encountered an enemy and lost " + damage + " health. Remaining health: " + health);
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println(playerName + " score increased by " + points + ". Total Score: " + score);
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
}

// File: Enemy.java
class Enemy {
    private String enemyType;
    private int health;
    private int damageLevel;
    private int xPosition;
    private int yPosition;

    public Enemy(String enemyType, int initialHealth, int damageLevel) {
        this.enemyType = enemyType;
        this.health = initialHealth;
        this.damageLevel = damageLevel;
        // Initialize enemy's position randomly
        this.xPosition = (int) (Math.random() * 5);
        this.yPosition = (int) (Math.random() * 5);
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    public void attack(Player player) {
        player.encounterEnemy(this.damageLevel);
        System.out.println(enemyType + " attacked " + player.getPlayerName() + " and dealt " + damageLevel + " damage.");
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
}

// File: GameMap.java
class GameMap {
    private char[][] mapLayout;

    public GameMap() {
        mapLayout = new char[5][5];
        initializeMap();
    }

    private void initializeMap() {
        for (int i = 0; i < mapLayout.length; i++) {
            for (int j = 0; j < mapLayout[i].length; j++) {
                mapLayout[i][j] = '.';
            }
        }
    }

    public void updateMapWithPlayer(Player player) {
        initializeMap(); // Clear map before updating
        mapLayout[player.getYPosition()][player.getXPosition()] = 'P';
    }

    public void updateMapWithEnemy(Enemy enemy) {
        if (mapLayout[enemy.getYPosition()][enemy.getXPosition()] == '.') {
            mapLayout[enemy.getYPosition()][enemy.getXPosition()] = 'E';
        }
    }

    public void printMap() {
        for (char[] row : mapLayout) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

// File: Game.java
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