import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase3TrainConsistMgmtTest {

    @Test
    public void testNoDuplicateBogies() {

        Set<String> bogies = new HashSet<>();

        bogies.add("B101");
        bogies.add("B102");
        bogies.add("B102"); // duplicate

        assertEquals(2, bogies.size());
    }

    @Test
    public void testContainsBogie() {

        Set<String> bogies = new HashSet<>();

        bogies.add("B101");

        assertTrue(bogies.contains("B101"));
    }
}