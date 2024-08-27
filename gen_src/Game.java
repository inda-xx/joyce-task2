class Game {
    public static void main(String[] args) {
        // Create a new Hero with a name and initial coordinates
        Hero hero = new Hero("John", 0, 0);

        // Create an Enemy at specific coordinates
        Enemy enemy = new Enemy(2, 2);
        
        // Move the hero to a new position
        hero.move(2, 2);
        
        // Interact with the enemy
        enemy.interact(hero);
        
        // Increase the hero's score
        hero.increaseScore(100);
        
        // Print the hero's updated information
        System.out.println("Hero " + hero.getName() + " at (" + hero.getXCoordinate() + ", " + hero.getYCoordinate() + ") with score: " + hero.getScore());
    }
}