import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthConvertorTest {
    private LengthConvertor lengthConvertor;

    @BeforeEach
    public void setup() {
        lengthConvertor = new LengthConvertor();
    }

    @Test
    public void checkForOneCentimeterIsOneCentimeter() {
        double actualMeasurement = lengthConvertor.unitConvertor(1, "centi", "centi");
        double expectedMeasurement = 1;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForOneMeterIsHundredCentimeters() {
        double actualMeasurement = lengthConvertor.unitConvertor(1, "base", "centi");
        double expectedMeasurement = 100;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void checkForHundredCentimeterIsZeroPointZeroZeroOneKilometers() {
        double actualMeasurement = lengthConvertor.unitConvertor(100, "centi", "kilo");
        double expectedMeasurement = 0.001;
        assertEquals(expectedMeasurement, actualMeasurement);
    }

    @Test
    public void throwsExceptionWhenMeasurementIsLessThanOrEqualToZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor.unitConvertor(-1, "centi", "centi");
        });
    }


    @Test
    public void throwsExceptionWhenUnitIsMillimeter() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor.unitConvertor(1, "milli", "milli");
        });
    }


    @Test
    public void throwsExceptionWhenUnitIsInvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            lengthConvertor.unitConvertor(1, "kilo", "kilo");
        });
    }

}
