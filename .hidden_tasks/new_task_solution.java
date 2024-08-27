// File: Player.java
class Player {
    private String name;
    private int score;
    private int health;
    private int xPosition;
    private int yPosition;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.health = 100;
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public void moveUp() {
        this.yPosition++;
    }

    public void moveDown() {
        this.yPosition--;
    }

    public void moveLeft() {
        this.xPosition--;
    }

    public void moveRight() {
        this.xPosition++;
    }

    public void printInfo() {
        System.out.println("Player: " + this.name);
        System.out.println("Score: " + this.score);
        System.out.println("Health: " + this.health);
        System.out.println("Position: (" + this.xPosition + ", " + this.yPosition + ")");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getXPosition() { return xPosition; }
    public void setXPosition(int xPosition) { this.xPosition = xPosition; }

    public int getYPosition() { return yPosition; }
    public void setYPosition(int yPosition) { this.yPosition = yPosition; }
}

// File: Enemy.java
class Enemy {
    private String type;
    private int strength;
    private int xPosition;
    private int yPosition;

    public Enemy(String type, int strength, int x, int y) {
        this.type = type;
        this.strength = strength;
        this.xPosition = x;
        this.yPosition = y;
    }

    public void interact(Player player) {
        if (player.getXPosition() == this.xPosition && player.getYPosition() == this.yPosition) {
            player.setHealth(player.getHealth() - this.strength);
            System.out.println("Player encountered a " + this.type + "! Health decreased by " + this.strength + ".");
        }
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }

    public int getXPosition() { return xPosition; }
    public void setXPosition(int xPosition) { this.xPosition = xPosition; }

    public int getYPosition() { return yPosition; }
    public void setYPosition(int yPosition) { this.yPosition = yPosition; }
}

// File: Game.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private String name;
    private Player player;
    private List<Enemy> enemies;

    public Game(String name, Player player) {
        this.name = name;
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to " + this.name + "!");

        while (true) {
            System.out.println("Enter a command (up, down, left, right, quit): ");
            String command = scanner.nextLine();
            
            switch (command.toLowerCase()) {
                case "up":
                    player.moveUp();
                    break;
                case "down":
                    player.moveDown();
                    break;
                case "left":
                    player.moveLeft();
                    break;
                case "right":
                    player.moveRight();
                    break;
                case "quit":
                    System.out.println("Quitting the game.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
                    continue;
            }

            player.printInfo();
            interactWithEnemies();

            if (player.getHealth() <= 0) {
                System.out.println("Game Over! Player has no health left.");
                scanner.close();
                break;
            }
        }
    }

    public void interactWithEnemies() {
        for (Enemy enemy : enemies) {
            enemy.interact(player);
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Hero");
        Game game = new Game("Adventure Game", player);

        Enemy enemy1 = new Enemy("Goblin", 20, 2, 2);
        Enemy enemy2 = new Enemy("Orc", 30, -1, -1);

        game.addEnemy(enemy1);
        game.addEnemy(enemy2);

        game.runGame();
    }
}