import org.junit.jupiter.api.Test;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase5TrainConsistMgmtTest {

    @Test
    public void testInsertionOrderAndUniqueness() {

        Set<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Sleeper"); // duplicate

        // Size should ignore duplicate
        assertEquals(3, train.size());

        // Order must be preserved
        String[] expected = {"Engine", "Sleeper", "Cargo"};
        assertArrayEquals(expected, train.toArray());
    }
}