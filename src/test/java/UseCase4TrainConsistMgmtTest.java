import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase4TrainConsistMgmtTest {

    @Test
    public void testTrainOperations() {

        LinkedList<String> train = new LinkedList<>();

        train.add("Sleeper");
        train.addFirst("Engine");
        train.addLast("Guard");

        assertEquals("Engine", train.getFirst());

        train.removeFirst();

        assertFalse(train.contains("Engine"));
    }
}