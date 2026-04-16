public class Bogie {

    private String name;
    private int capacity;
    private String type; // NEW

    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }


    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    // toString for printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}