import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC6: Bogie Capacity Mapping ===");

        // Create HashMap
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Add entries
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Display using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}