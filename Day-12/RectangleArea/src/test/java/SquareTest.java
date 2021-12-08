import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Nested
    class SquareAreaTest {
        @Test
        public void areaOfSideTwo() {
            Square area = new Square(2);
            double answer = area.area();
            double expected = 4;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfSideZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square area = new Square(0);
                area.area();
            });
        }

        @Test
        public void areaOfSideNegThree() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square area = new Square(0);
                area.area();
            });
        }
    }

    @Nested
    class SquarePerimeterTest {
        @Test
        public void perimeterOfSideTwo() {
            Square perimeter = new Square(2);
            double answer = perimeter.perimeter();
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void perimeterOfSideZero() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square perimeter = new Square(0);
                perimeter.perimeter();
            });
        }

        @Test
        public void perimeterOfSideNegThree() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                Square perimeter = new Square(0);
                perimeter.perimeter();
            });
        }
    }
}
