import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    public void testGroupingBogies() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("Cargo", 100, "Goods"));

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        assertEquals(2, grouped.get("Passenger").size());
        assertEquals(1, grouped.get("Goods").size());
    }
}