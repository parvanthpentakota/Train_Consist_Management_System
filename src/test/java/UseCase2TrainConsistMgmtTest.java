import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase2TrainConsistMgmtTest {

    @Test
    public void testAddAndRemoveBogies() {

        List<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Remove
        bogies.remove("AC Chair");

        // Assertions
        assertEquals(2, bogies.size());
        assertTrue(bogies.contains("Sleeper"));
        assertFalse(bogies.contains("AC Chair"));
    }
}