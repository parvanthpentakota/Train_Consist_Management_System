import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC8: Filter Bogies using Stream ===");

        // Reuse Bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Luxury"));
        // Apply filter using Stream
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // Display result
        System.out.println("Filtered Bogies (capacity > 60):");
        filtered.forEach(System.out::println);
    }
}