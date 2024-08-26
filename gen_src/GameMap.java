class GameMap {
    private char[][] mapLayout;

    public GameMap() {
        mapLayout = new char[5][5];
        initializeMap();
    }

    private void initializeMap() {
        for (int i = 0; i < mapLayout.length; i++) {
            for (int j = 0; j < mapLayout[i].length; j++) {
                mapLayout[i][j] = '.';
            }
        }
    }

    public void updateMapWithPlayer(Player player) {
        initializeMap(); // Clear map before updating
        mapLayout[player.getYPosition()][player.getXPosition()] = 'P';
    }

    public void updateMapWithEnemy(Enemy enemy) {
        if (mapLayout[enemy.getYPosition()][enemy.getXPosition()] == '.') {
            mapLayout[enemy.getYPosition()][enemy.getXPosition()] = 'E';
        }
    }

    public void printMap() {
        for (char[] row : mapLayout) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
