class Game {
    public static void main(String[] args) {
        // Create a Player object
        Player hero = new Player("Hero", 0, 0);
        
        // Create an Enemy object
        Enemy badGuy = new Enemy(5, 5);
        
        // Simulate player reaching enemy
        hero.setPosition(5, 5);
        badGuy.interact(hero);

        // Display final score
        System.out.println("Final Score: " + hero.getScore());
    }
}