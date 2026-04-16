import java.util.LinkedList;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=== UC4: Train Consist Ordering ===");

        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Sleeper");
        train.add("AC Chair");

        // Add at beginning
        train.addFirst("Engine");

        // Add at end
        train.addLast("Guard");

        System.out.println("Train after additions: " + train);

        // Remove from front
        train.removeFirst();

        System.out.println("After removing engine: " + train);
    }
}