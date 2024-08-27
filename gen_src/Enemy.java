class Enemy {
    // Fields for enemy attributes
    private String type;
    private int positionX;
    private int positionY;
    private int damage;

    // Constructor to initialize enemy with a type and damage
    public Enemy(String type, int damage) {
        this.type = type;
        this.damage = damage;
        this.positionX = (int) (Math.random() * 100); // Random initial position
        this.positionY = (int) (Math.random() * 100);
    }

    // Getter methods for type
    public String getType() { return type; }

    // Getter methods for damage
    public int getDamage() { return damage; }

    // Getter methods for positionX
    public int getPositionX() { return positionX; }

    // Getter methods for positionY
    public int getPositionY() { return positionY; }

    // Main method to test the Enemy class
    public static void main(String[] args) {
        // Create an enemy object
        Enemy enemy = new Enemy("Orc", 10);

        // Test enemy methods
        System.out.println("Enemy type: " + enemy.getType());
        System.out.println("Enemy position: (" + enemy.getPositionX() + ", " + enemy.getPositionY() + ")");
        System.out.println("Enemy damage: " + enemy.getDamage());
    }
}