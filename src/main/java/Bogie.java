public class Bogie {

    private String name;
    private int capacity;
    private String type;

    // Constructor 1 (OLD)
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.type = "General";
    }

    // Constructor 2 (NEW)
    public Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

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
    }
}