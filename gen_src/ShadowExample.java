class ShadowExample {
    // Field to demonstrate shadowing
    private int count;

    // Constructor that correctly assigns the count field
    public ShadowExample(int count) {
        this.count = count; // Using 'this' to refer to the instance variable
    }

    // Method to demonstrate variable shadowing
    public void printShadow() {
        int count = 5; // Local variable with the same name as the instance variable
        System.out.println(this.count); // Use 'this' to reference the instance variable
    }
}