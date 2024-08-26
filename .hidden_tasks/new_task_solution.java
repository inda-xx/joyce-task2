// File: Spaceship.java
class Spaceship {
    // Fields for Spaceship
    private String model;
    private double speed; // in light-years per hour
    private boolean operational;

    // Constructor for Spaceship
    public Spaceship(String model, double speed, boolean operational) {
        this.model = model;
        this.speed = speed;
        this.operational = operational;
    }

    // Getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter for speed
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    // Getter and setter for operational
    public boolean isOperational() {
        return operational;
    }

    public void setOperational(boolean operational) {
        this.operational = operational;
    }

    // Method to print fleet information
    public void printFleetInfo() {
        System.out.println("Spaceship Model: " + model);
        System.out.println("Speed: " + speed + " light-years/hour");
        System.out.println("Operational: " + (operational ? "Yes" : "No"));
    }
}

// File: GalacticTraveler.java
class GalacticTraveler {
    // Fields for GalacticTraveler
    private String travelerName;
    private int age;
    private String homePlanet;
    private Spaceship spaceship;

    // Constructor for GalacticTraveler
    public GalacticTraveler(String travelerName, int age, String homePlanet, Spaceship spaceship) {
        this.travelerName = travelerName;
        this.age = age;
        this.homePlanet = homePlanet;
        this.spaceship = spaceship;
    }

    // Getter and setter for travelerName
    public String getTravelerName() {
        return travelerName;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter for homePlanet
    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    // Getter and setter for spaceship
    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    // Method to travel to a specified destination
    public void travelTo(String destination) {
        System.out.println(travelerName + " is traveling to " + destination + " in their spaceship " + spaceship.getModel() + "!");
    }

    // Method to explore the galaxy
    public void exploreGalaxy() {
        System.out.println("Exploring the galaxy...");
        System.out.println(travelerName + " discovers a new planet full of exotic flora and fauna.");
        System.out.println(travelerName + " navigates through a dense asteroid belt, showing commendable skills!");
    }

    // Main method to demonstrate class functionality
    public static void main(String[] args) {
        Spaceship voyager = new Spaceship("Voyager XL", 0.2, true);
        GalacticTraveler traveler = new GalacticTraveler("Luna Stark", 29, "Earth", voyager);

        System.out.println("Traveler: " + traveler.getTravelerName());
        System.out.println("Age: " + traveler.getAge());
        System.out.println("Home Planet: " + traveler.getHomePlanet());

        // Use the travelTo method
        traveler.travelTo("Mars");

        // Use the exploreGalaxy method
        traveler.exploreGalaxy();

        // Print fleet details
        voyager.printFleetInfo();
    }
}