import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class WeightCalculatorTest {
    private LengthCalculator add, sub;

    @Nested
    class WeightsAdditionTest {
        @BeforeEach
        public void setUp() {
            add = new LengthCalculator();
        }

        @Test
        public void tenGramPlusOneKilogramIsThousandTenGram() {
            double answer = add.addUnits(10, "base", 1, "kilo", "base");
            double expected = 1010;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class UnitsSubtractionTest {
        @BeforeEach
        public void setUp() {
            sub = new LengthCalculator();
        }

        @Test
        public void onePointFiveKilogramMinusFiveHundredGramsIsOneKilogram() {
            double answer = sub.subUnits(1.5, "kilo", 500, "base", "kilo");
            double expected = 1;
            assertEquals(answer, expected);
        }
    }
}
