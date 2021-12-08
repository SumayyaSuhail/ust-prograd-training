import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Nested
    class RectangleAreaTest {
        private AreaAndPerimeter area;
        @Test
        public void areaOfFourAndTwoIsEight() {
            area = new AreaAndPerimeter(4, 2);
            double answer = area.areaOfRectangle();
            double expected = 8;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfSixAndThreeIsEighteen() {
            area = new AreaAndPerimeter(6, 3);
            double answer = area.areaOfRectangle();
            double expected = 18;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumbersException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                        area = new AreaAndPerimeter(-4, 0);
                        area.areaOfRectangle();
                    }
            );
        }
    }
    @Nested
    class RectanglePerimeterTest{
        private AreaAndPerimeter perimeter;
        @Test
        public void perimeterOfFourAndTwoIsTwelve(){
            perimeter = new AreaAndPerimeter(4,2);
            double answer = perimeter.perimeterOfRectangle();
            double expected = 12;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void perimeterOfSixAndThreeIsEighteen() {
            perimeter = new AreaAndPerimeter(6, 3);
            double answer = perimeter.perimeterOfRectangle();
            double expected = 18;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfNegativeNumbersException() {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                        perimeter = new AreaAndPerimeter(-4, 0);
                        perimeter.perimeterOfRectangle();
                    }
            );
        }
    }
}
