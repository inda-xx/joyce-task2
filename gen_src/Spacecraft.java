class Spacecraft {

    // Declare private fields
    private String name;
    private double fuelLevel; // Fuel level as a percentage
    private int maxSpeed; // Max speed in km/h
    private String currentPlanet;

    // Constructor to initialize the spacecraft with given values
    public Spacecraft(String name, double fuelLevel, int maxSpeed, String currentPlanet) {
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.maxSpeed = maxSpeed;
        this.currentPlanet = currentPlanet;
    }

    // Getters for each field
    public String getName() {
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCurrentPlanet() {
        return currentPlanet;
    }

    // Setters for each field
    public void setName(String name) {
        this.name = name;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentPlanet(String currentPlanet) {
        this.currentPlanet = currentPlanet;
    }

    // Method to print all the spacecraft's details
    public void printInfo() {
        System.out.println("Spacecraft Info");
        System.out.println("Name: " + name);
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Current Planet: " + currentPlanet);
    }

    // Method to explore a new planet
    public void explore(String newPlanet) {
        // Logic to check fuel level and travel to a new planet
        // Update currentPlanet and reduce fuelLevel accordingly
    }

    // Main method to test the functionality of the Spacecraft class
    public static void main(String[] args) {
        // Create a new Spacecraft object using the constructor
        Spacecraft voyager = new Spacecraft("Voyager", 100.0, 20000, "Earth");

        // Print the spacecraft's information
        voyager.printInfo();

        // Example: Voyager explores Mars
        voyager.explore("Mars");
    }
}