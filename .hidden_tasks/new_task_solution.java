Here's the complete Java solution for the Dodger's Adventure game, including the required classes and methods:

Player.java:
```java
public class Player {
    // Fields
    private String name;
    private int position;
    private int score;

    // Constructor
    public Player(String name, int position) {
        this.name = name;
        this.position = position;
        this.score = 0; // Initial score is 0
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getScore() {
        return score;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method for moving the player
    public void move(int steps) {
        this.position += steps;
    }
}
```

Enemy.java:
```java
public class Enemy {
    // Fields
    private String type;
    private int position;

    // Constructor
    public Enemy(String type, int position) {
        this.type = type;
        this.position = position;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getPosition() {
        return position;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
```

Game.java:
```java
import java.util.ArrayList;

public class Game {
    // Fields
    private Player player;
    private ArrayList<Enemy> enemies;

    // Constructor
    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    // Getters
    public Player getPlayer() {
        return player;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    // Method to update score and check collisions
    public void updateScoreAndCheckCollisions() {
        boolean collision = false;

        for (Enemy enemy : enemies) {
            if (player.getPosition() == enemy.getPosition()) {
                System.out.println("Collision with " + enemy.getType() + "!");
                collision = true;
                break;
            }
        }

        if (!collision) {
            player.setScore(player.getScore() + 10);
            System.out.println("Score: " + player.getScore());
        }
    }

    public static void main(String[] args) {
        // Create a player object
        Player player = new Player("Hero", 0);
        
        // Create a game object
        Game game = new Game(player);
        
        // Move the player and update position
        player.move(5); // Move player forward 5 steps
        System.out.println("Player's new position: " + player.getPosition());

        // Example of adding an enemy and checking for collisions
        Enemy goblin = new Enemy("Goblin", 5);
        game.getEnemies().add(goblin);

        // Check for collisions and update score
        game.updateScoreAndCheckCollisions();
    }
}
```

Each class includes constructors, getters, and setters for its fields, along with additional methods to handle movement and collisions. The main method in the `Game` class demonstrates creating instances of `Player` and `Enemy`, moving the player, and checking for collisions.