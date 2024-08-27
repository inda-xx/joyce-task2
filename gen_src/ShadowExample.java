class ShadowExample {
    private String name;

    public ShadowExample(String name) {
        this.name = name; // Using 'this' to refer to the instance variable
    }

    public void printName() {
        String name = "Temporary Name";
        System.out.println(this.name); // Using 'this' to print the instance variable
    }

    public static void main(String[] args) {
        new ShadowExample("Real Name").printName();
    }
}