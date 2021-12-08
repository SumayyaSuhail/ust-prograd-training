import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Nested
    class SquareAreaTest {
        @Test
        public void areaOfSideTwo() {
            AreaAndPerimeter area = new AreaAndPerimeter(2);
            double answer = area.areaOfSquare();
            double expected = 4;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfSideZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                AreaAndPerimeter area = new AreaAndPerimeter(0);
                area.areaOfSquare();
            });
        }

        @Test
        public void areaOfSideNegThree() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                AreaAndPerimeter area = new AreaAndPerimeter(0);
                area.areaOfSquare();
            });
        }
    }
    @Nested
    class SquarePerimeterTest{
        @Test
        public void perimeterOfSideTwo() {
            AreaAndPerimeter perimeter = new AreaAndPerimeter(2);
            double answer = perimeter.perimeterOfSquare();
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void perimeterOfSideZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                AreaAndPerimeter perimeter = new AreaAndPerimeter(0);
                perimeter.perimeterOfSquare();
            });
        }

        @Test
        public void perimeterOfSideNegThree() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                AreaAndPerimeter perimeter = new AreaAndPerimeter(0);
                perimeter.perimeterOfSquare();
            });
        }
    }
}
