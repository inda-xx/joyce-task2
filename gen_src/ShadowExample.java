class ShadowExample {
    private int population = 1000; // Targeted instance variable

    public void printShadow() {
        int population = 2000; // Local variable shadowing instance variable
        System.out.println(population); // Prints the local variable
    }

    public static void main(String[] args){
        new ShadowExample().printShadow();
    }
}

// Building.java
public 