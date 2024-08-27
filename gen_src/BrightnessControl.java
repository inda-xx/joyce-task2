class BrightnessControl {
    private int brightness = 100; // I want this brightness printed

    public void setBrightness(int brightness) {
        // Use 'this' to refer to the field
        this.brightness = brightness / 2;
        System.out.println(this.brightness);
    }

    public static void main(String[] args) {
        // Create an instance and test the method
        new BrightnessControl().setBrightness(80);
    }
}

// File: Gadget.java
public 