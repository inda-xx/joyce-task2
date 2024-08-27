class Building {
    private String color; // Instance field

    public Building(String color) {
        this.color = color; // Use `this` to refer to the instance variable
    }

    public void describe() {
        String color = "Green"; // Local variable
        System.out.println("The building is " + color); // Prints the local variable
    }

    public static void main(String[] args){
        Building building = new Building("Red");
        building.describe();
    }
}