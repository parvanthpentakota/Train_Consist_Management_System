import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie Management ===");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add bogies
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");

        // Add duplicate
        bogieIds.add("B102"); // ignored automatically

        // Display
        System.out.println("Bogie IDs: " + bogieIds);
    }
}