import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    public void testFilterBogies() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Luxury"));
        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).getName());
    }
}