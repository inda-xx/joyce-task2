class Enemy {
    private String type;

    public Enemy(String type) {
        // Use 'this' keyword to differentiate parameter from field
    }

    public void displayType() {
        String type = "Unknown";
        // Correct the shadowing issue to print the actual enemy type
    }
}