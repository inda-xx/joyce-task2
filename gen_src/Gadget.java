class Gadget {
    private String name;
    private String type;

    public Gadget(String name, String type) {
        // Correctly use 'this' to differentiate parameters and fields
        this.name = name;
        this.type = type;
    }

    public void showGadget() {
        String name = "QuickFix"; // Local variable shadows the field
        System.out.println(name + " is available!"); // Shows the local variable, not the field
    }

    public static void main(String[] args) {
        // Create an instance and test the method
        Gadget gadget = new Gadget("SmartDevice", "Utility");
        gadget.showGadget(); // Will print "QuickFix is available!"
    }
}