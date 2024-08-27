class SmartLight {
    // Private fields for encapsulation
    private String model;
    private boolean isOn;
    private int brightness; // Brightness level from 0 to 100 percent
    private String color;
    private boolean isConnected;

    // Constructor to initialize all fields
    public SmartLight(String model, boolean isOn, int brightness, String color, boolean isConnected) {
        // Use 'this' keyword to refer to the current object's fields
        this.model = model;
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
        this.isConnected = isConnected;
    }

    // Getters for accessing private fields
    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getColor() {
        return color;
    }

    public boolean isConnected() {
        return isConnected;
    }

    // Setters for modifying private fields
    public void setModel(String model) {
        this.model = model;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    // Method to print details of the SmartLight
    public void printDetails() {
        System.out.println("Gadget Details:");
        System.out.println("Model: " + model);
        System.out.println("Power State: " + (isOn ? "On" : "Off"));
        System.out.println("Brightness: " + brightness + "%");
        System.out.println("Color: " + color);
        System.out.println("Connectivity Status: " + (isConnected ? "Connected" : "Disconnected"));
    }

    // Method to toggle the power state
    public void togglePower() {
        isOn = !isOn;
    }

    public static void main(String[] args) {
        // Example of creating a SmartLight object
        SmartLight kitchenLight = new SmartLight("EcoShine", true, 65, "Cool Blue", true);

        // Test getters and setters
        kitchenLight.setModel("EcoShine");
        kitchenLight.setOn(true);
        kitchenLight.setBrightness(65);
        kitchenLight.setColor("Cool Blue");
        kitchenLight.setConnected(true);

        // Print SmartLight details using the method
        kitchenLight.printDetails();

        // Toggle the power state
        System.out.println("Toggling Power...");
        kitchenLight.togglePower();
        System.out.println("Is the light On? " + kitchenLight.isOn());
    }
}

// File: BrightnessControl.java
public 