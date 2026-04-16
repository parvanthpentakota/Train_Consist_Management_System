import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC2: Train Bogie Management ===");

        // Create list
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        System.out.println("After Removing: " + bogies);

        // Check existence
        System.out.println("Sleeper exists? " + bogies.contains("Sleeper"));
    }
}