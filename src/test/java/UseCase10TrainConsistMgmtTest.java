import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    @Test
    public void testTotalCapacity() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Luxury"));

        int total = bogies.stream()
                .map(b -> b.getCapacity())
                .reduce(0, Integer::sum);

        assertEquals(172, total);
    }
}