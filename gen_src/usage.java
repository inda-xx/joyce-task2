class usage
    public static void main(String[] args) {
        // Create a Spaceship object
        Spaceship voyager = new Spaceship("Voyager XL", 0.2, true);

        // Create a GalacticTraveler object
        GalacticTraveler traveler = new GalacticTraveler("Luna Stark", 29, "Earth", voyager);

        // Print traveler details using getters
        System.out.println("Traveler: " + traveler.getTravelerName());
        System.out.println("Age: " + traveler.getAge());
        System.out.println("Home Planet: " + traveler.getHomePlanet());

        // Use the travelTo method
        traveler.travelTo("Mars");

        // Use the exploreGalaxy method
        traveler.exploreGalaxy();
    }
}

// Spaceship.java

public 