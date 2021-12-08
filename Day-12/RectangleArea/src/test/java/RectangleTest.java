import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Nested
    class RectangleAreaTest {
        private Rectangle area;
        @Test
        public void areaOfFourAndTwoIsEight() {
            area = new Rectangle(4, 2);
            double answer = area.area();
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfSixAndThreeIsEighteen() {
            area = new Rectangle(6, 3);
            double answer = area.area();
            double expected = 18;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumbersException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                        area = new Rectangle(-4, 0);
                        area.area();
                    }
            );
        }
    }
    @Nested
    class RectanglePerimeterTest{
        private Rectangle perimeter;
        @Test
        public void perimeterOfFourAndTwoIsTwelve(){
            perimeter = new Rectangle(4,2);
            double answer = perimeter.perimeter();
            double expected = 12;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void perimeterOfSixAndThreeIsEighteen() {
            perimeter = new Rectangle(6, 3);
            double answer = perimeter.perimeter();
            double expected = 18;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumbersException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                        perimeter = new Rectangle(-4, 0);
                        perimeter.perimeter();
                    }
            );
        }
    }
}
