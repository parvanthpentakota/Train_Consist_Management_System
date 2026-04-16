import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    @Test
    public void testValidTrainId() {
        assertTrue(Pattern.matches("TRN-\\d{4}", "TRN-1234"));
    }

    @Test
    public void testInvalidTrainId() {
        assertFalse(Pattern.matches("TRN-\\d{4}", "TRN-12"));
    }

    @Test
    public void testValidCargoCode() {
        assertTrue(Pattern.matches("PET-[A-Z]{2}", "PET-AB"));
    }

    @Test
    public void testInvalidCargoCode() {
        assertFalse(Pattern.matches("PET-[A-Z]{2}", "PET-A1"));
    }
}
