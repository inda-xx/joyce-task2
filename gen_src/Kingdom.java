class Kingdom {
    // Declare fields
    private String kingdomName;
    private int population;
    private double treasury;
    private String rulerName;
    private boolean prosperityStatus;

    // Constructor
    public Kingdom(String kingdomName, int population, double treasury, String rulerName) {
        // Initialize fields using the constructor parameters
        // Remember to consider how to set the initial prosperityStatus
    }

    // Getters
    public String getKingdomName() {
        // Return the kingdom's name
        return "";
    }

    public int getPopulation() {
        // Return the population
        return 0;
    }

    public double getTreasury() {
        // Return the treasury amount
        return 0.0;
    }

    public String getRulerName() {
        // Return the ruler's name
        return "";
    }

    public boolean isProsperityStatus() {
        // Return the prosperity status
        return false;
    }

    // Setters
    public void setKingdomName(String kingdomName) {
        // Set the kingdom's name
    }

    public void setPopulation(int population) {
        // Set the population
    }

    public void setTreasury(double treasury) {
        // Set the treasury amount
        // Consider invoking declareProsperous here if needed
    }

    public void setRulerName(String rulerName) {
        // Set the ruler's name
    }

    public void setProsperityStatus(boolean prosperityStatus) {
        // Set the prosperity status
    }

    // Method to display kingdom's information
    public void displayInfo() {
        // Print all fields in a formatted way
        // Include the prosperity status in the output
    }

    // Method to declare prosperity based on treasury
    public void declareProsperous() {
        // Determine if the kingdom is prosperous based on the treasury
        // Update prosperityStatus and print a relevant message
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a new Kingdom object using the constructor
        Kingdom serenia = new Kingdom("Serenia", 2000, 3.5, "Queen Athena");

        // Call methods to test the functionality (e.g., displayInfo)
        // Modify fields using setters and re-invoke relevant methods to observe changes
    }
}