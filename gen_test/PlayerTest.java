class Player {
    private String name;
    private int score;
    private int xPos;
    private int yPos;

    public Player(String name, int x, int y) {
        this.name = name;
        this.score = 0;
        this.xPos = x;
        this.yPos = y;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getXPos() { return xPos; }
    public int getYPos() { return yPos; }
    public void setXPos(int xPos) { this.xPos = xPos; }
    public void setYPos(int yPos) { this.yPos = yPos; }

    public void move(int deltaX, int deltaY) {
        this.xPos += deltaX;
        this.yPos += deltaY;
    }

    public void interact(Enemy enemy) {
        if (this.xPos == enemy.getXPos() && this.yPos == enemy.getYPos()) {
            this.score += 10;
        }
    }
}

