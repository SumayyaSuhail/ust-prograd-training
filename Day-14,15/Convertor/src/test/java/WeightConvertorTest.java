import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConvertorTest {
    private LengthConvertor weightConvertor;
    @BeforeEach
    public void setWeightConvertor(){
        weightConvertor=new LengthConvertor();
    }
    @Test
    public void checkForOneGramIsOneGram() {
        double actualWeight = weightConvertor.unitConvertor(1, "base", "base");
        double expectedWeight = 1;
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void checkForPointOneKilogramIsHundredGrams() {
        double actualWeight = weightConvertor.unitConvertor(0.1, "kilo", "base");
        double expectedWeight = 100;
        assertEquals(expectedWeight, actualWeight);
    }
}
