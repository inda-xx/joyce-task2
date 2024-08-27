// File: Alien.java
class Alien {
    // Private fields for Alien attributes
    private String speciesName;
    private int energyLevel;
    private int strength;
    private int intelligence;
    private boolean peaceful;

    // Constructor to initialize an Alien object
    public Alien(String speciesName, int energyLevel, int strength, int intelligence) {
        this.speciesName = speciesName;
        this.energyLevel = energyLevel;
        this.strength = strength;
        this.intelligence = intelligence;
        // Peaceful aliens have intelligence greater than strength by default
        this.peaceful = intelligence > strength;
    }

    // Getters and setters for encapsulation
    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public boolean isPeaceful() {
        return peaceful;
    }

    public void setPeaceful(boolean peaceful) {
        this.peaceful = peaceful;
    }

    // Method to print details of the alien object
    public void printDetails() {
        System.out.println("> INFO");
        System.out.println("> Species: " + speciesName);
        System.out.println("> Energy Level: " + energyLevel);
        System.out.println("> Strength: " + strength);
        System.out.println("> Intelligence: " + intelligence);
        System.out.println("> Peaceful: " + peaceful);
    }

    // Method for simulating combat between two aliens
    public void combat(Alien defender) {
        double energyImpact = (this.strength - defender.intelligence / 2.0);
        defender.energyLevel -= energyImpact;

        // Ensure not to drop below zero
        if (defender.energyLevel < 0) {
            defender.energyLevel = 0;
        }

        System.out.println("> Alien " + this.speciesName + " assaulted alien " + defender.speciesName + ". Estimated impact was " + energyImpact + " energy units!");
        System.out.println("> Alien " + defender.speciesName + " now has " + defender.energyLevel + " energy left!");
    }

    public static void main(String[] args) {
        Alien zorb = new Alien("Zorb", 80, 75, 85);
        Alien nebula = new Alien("Nebula", 70, 65, 80);

        zorb.printDetails();
        nebula.printDetails();

        zorb.combat(nebula);
    }
}