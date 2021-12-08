import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @Nested
    class TestingWithAdd{
        @BeforeEach
        public void setUp(){
            calc=new Calculator();
        }
        @Test
        public void fivePlusThreeIsEight(){
            double answer=calc.add(5,3);
            double expected = 8;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negTwoPlusThreeIsOne(){
            double answer = calc.add(-2,3);
            double expected = 1;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void fivePlusZeroIsFive(){
            double answer=calc.add(5,0);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }
    }
    @Nested
    class TestingWithSub{
        @BeforeEach
        public void setUp(){
            calc=new Calculator();
        }
        @Test
        public void fiveMinusThreeIsTwo(){
            double answer=calc.sub(5,3);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void fiveMinusSixIsNegOne(){
            double answer=calc.sub(5,6);
            double expected = -1;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void zeroMinusThreeIsNegThree(){
            double answer=calc.sub(0,3);
            double expected = -3;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    class TestingWithDiv{
        @BeforeEach
        public void setUp(){
            calc=new Calculator();
        }
        @Test
        public void fourDividedByTwoIsTwo(){
            double answer=calc.div(4,2);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negSixDividedByNegOneIsSix(){
            double answer=calc.div(-6,-1);
            double expected = 6;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenDividedByZero(){
            Assertions.assertThrows(ArithmeticException.class,()->calc.div(10,0));
        }
    }
    @Nested
    class TestingWithMul{
        @BeforeEach
        public void setUp(){
            calc=new Calculator();
        }
        @Test
        public void fourMultipliesTwoIsEight(){
            double answer=calc.mul(4,2);
            double expected = 8;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negTwoMultipliesThreeIsNegSix(){
            double answer=calc.mul(-2,3);
            double expected = -6;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void negOneMultipliesNegFiveIsFive(){
            double answer=calc.mul(-1,-5);
            double expected = 5;
            Assertions.assertEquals(answer,expected);
        }
    }
}