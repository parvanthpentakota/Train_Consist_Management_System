import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase7TrainConsistMgmtTest {

    @Test
    public void testSortingByCapacity() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Check smallest first
        assertEquals("First Class", bogies.get(0).getName());
        assertEquals(40, bogies.get(0).getCapacity());
    }
}