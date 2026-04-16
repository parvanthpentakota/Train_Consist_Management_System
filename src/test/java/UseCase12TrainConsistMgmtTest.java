import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    public void testSafeTrain() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", 100, "Cylindrical", "Petroleum"));
        bogies.add(new Bogie("B2", 90, "Box", "Coal"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum")
                );

        assertTrue(isSafe);
    }

    @Test
    public void testUnsafeTrain() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("B1", 100, "Cylindrical", "Coal")); // invalid

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum")
                );

        assertFalse(isSafe);
    }
}
