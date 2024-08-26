class Enemy {
    // Fields to represent enemy attributes
    private String enemyName;
    private int damage;
    private int[] position;

    // Constructor to initialize an enemy with a name, damage, and position
    public Enemy(String enemyName, int damage, int[] position) {
        this.enemyName = enemyName;
        this.damage = damage;
        this.position = position;
    }

    // Getter and setters for encapsulation
    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public static void main(String[] args) {
        // You can use this method to test the Enemy class
        // For example, create an enemy and print its attributes
    }
}