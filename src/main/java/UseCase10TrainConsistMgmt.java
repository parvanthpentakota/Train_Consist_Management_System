import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seating Capacity ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Luxury"));

        // Stream aggregation
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        System.out.println("Total Capacity: " + totalCapacity);
    }
}
