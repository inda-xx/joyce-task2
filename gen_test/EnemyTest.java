class Enemy {
    private String type;
    private int xPos;
    private int yPos;

    public Enemy(String type, int x, int y) {
        this.type = type;
        this.xPos = x;
        this.yPos = y;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public int getXPos() { return xPos; }
    public void setXPos(int xPos) { this.xPos = xPos; }
    public int getYPos() { return yPos; }
    public void setYPos(int yPos) { this.yPos = yPos; }
}