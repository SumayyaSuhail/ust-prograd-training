import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UnitCalculatorTest {
    private UnitCalculator add, sub;

    @Nested
    class UnitsAdditionTest {
        @BeforeEach
        public void setUp() {
            add = new UnitCalculator();
        }

        @Test
        public void oneMetrePlusHundredCentimetreIsTwoMetre() {
            double answer = add.addUnits(1, "m", 100, "cm", "m");
            double expected = 2;
            assertEquals(answer, expected);
        }

        @Test
        public void twoHundredCentimetrePlusOneKilometreIsOneLakhTwoHundredCentimetre() {
            double answer = add.addUnits(200, "cm", 1, "km", "cm");
            double expected = 100200;
            assertEquals(answer, expected);
        }
    }

    @Nested
    class UnitsSubtractionTest {
        @BeforeEach
        public void setUp() {
            sub = new UnitCalculator();
        }

        @Test
        public void oneMetreMinusFiftyCentimetreIsPointFiveMetre() {
            double answer = sub.subUnits(1, "m", 50, "cm", "m");
            double expected = 0.5;
            assertEquals(answer, expected);
        }

        @Test
        public void twoThousandCentimetreMinusOneMetreIsThousandNineHundredCentimetre() {
            double answer = sub.subUnits(2000, "cm", 1, "m", "cm");
            double expected = 1900;
            assertEquals(answer, expected);
        }
    }
}
