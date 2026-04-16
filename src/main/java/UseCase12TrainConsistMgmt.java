import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Validation ===");

        List<Bogie> bogies = new ArrayList<>();

        // Goods bogies
        bogies.add(new Bogie("B1", 100, "Cylindrical", "Petroleum"));
        bogies.add(new Bogie("B2", 90, "Box", "Coal"));
        bogies.add(new Bogie("B3", 110, "Cylindrical", "Petroleum"));

        // Safety rule
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum")
                );

        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}