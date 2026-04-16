public class Bogie {

    private String name;
    private int capacity;
    private String type;
    private String cargo; // NEW

    // Constructor (full)
    public Bogie(String name, int capacity, String type, String cargo) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.cargo = cargo;
    }

    // Overloaded constructor
    public Bogie(String name, int capacity, String type) {
        this(name, capacity, type, "General");

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Old constructor
    public Bogie(String name, int capacity) {
        this(name, capacity, "General", "General");
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }
    public String getType() { return type; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return name + " (" + type + ", Cargo: " + cargo + ")";
        return name + " (" + capacity + ")";
    // toString for printing
    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}