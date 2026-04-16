import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC11: Regex Validation ===");

        // Sample inputs
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // Validate using regex
        boolean isTrainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean isCargoValid = Pattern.matches("PET-[A-Z]{2}", cargoCode);

        // Output results
        if (isTrainValid) {
            System.out.println("Valid Train ID: " + trainId);
        } else {
            System.out.println("Invalid Train ID: " + trainId);
        }

        if (isCargoValid) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }
    }
}