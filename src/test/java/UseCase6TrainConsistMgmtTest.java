import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase6TrainConsistMgmtTest {

    @Test
    public void testBogieCapacityMapping() {

        Map<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);

        // Check values
        assertEquals(72, bogieCapacity.get("Sleeper"));
        assertEquals(60, bogieCapacity.get("AC Chair"));
    }

    @Test
    public void testKeyExists() {

        Map<String, Integer> map = new HashMap<>();
        map.put("First Class", 40);

        assertTrue(map.containsKey("First Class"));
    }
}