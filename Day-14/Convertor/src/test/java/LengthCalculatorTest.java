import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class LengthCalculatorTest {
    private LengthCalculator add, sub;

    @Nested
    class UnitsAdditionTest {
        @BeforeEach
        public void setUp() {
            add = new LengthCalculator();
        }

        @Test
        public void oneMetrePlusHundredCentimetreIsTwoMetre() {
            double answer = add.addUnits(1, "base", 100, "centi", "base");
            double expected = 2;
            assertEquals(answer, expected);
        }

        @Test
        public void twoHundredCentimetrePlusOneKilometreIsOneLakhTwoHundredCentimetre() {
            double answer = add.addUnits(200, "centi", 1, "kilo", "centi");
            double expected = 100200;
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
        public void oneMetreMinusFiftyCentimetreIsPointFiveMetre() {
            double answer = sub.subUnits(1, "base", 50, "centi", "base");
            double expected = 0.5;
            assertEquals(answer, expected);
        }

        @Test
        public void twoThousandCentimetreMinusOneMetreIsThousandNineHundredCentimetre() {
            double answer = sub.subUnits(2000, "centi", 1, "base", "centi");
            double expected = 1900;
            assertEquals(answer, expected);
        }
    }
}
