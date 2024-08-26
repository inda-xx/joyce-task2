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
