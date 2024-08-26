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
