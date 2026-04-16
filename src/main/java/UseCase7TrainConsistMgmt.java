import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}