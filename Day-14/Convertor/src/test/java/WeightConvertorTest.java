import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConvertorTest {
    @Test
    public void checkForOneGramIsOneGram() {
        double actualWeight = weightConvertor.unitConvertor(1, "g", "g");
        double expectedWeight = 1;
        assertEquals(expectedWeight, actualWeight);
    }
    @Test
    public void checkForPointOneKilogramIsHundredGrams() {
        double actualWeight = weightConvertor.unitConvertor(0.1, "kg", "g");
        double expectedWeight = 100;
        assertEquals(expectedWeight, actualWeight);
    }
    @Test
    public void checkForPointOneKilogramIsHundredGrams() {
        double actualWeight = weightConvertor.unitConvertor(0.1, "kg", "g");
        double expectedWeight = 100;
        assertEquals(expectedWeight, actualWeight);
    }
}
