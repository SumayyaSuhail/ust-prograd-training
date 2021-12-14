import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CoinProbabilityTest {
    private CoinProbability coinProbability;

    @Nested
    class SingleCoin {
        @BeforeEach
        public void setUp() {
            coinProbability = new CoinProbability();
        }

        @DisplayName("Probability of Head or Tails on a single coin toss")
        @Test
        public void probabilityOfHeadAndTailInSingleTossIsEqual() {
            double answer = coinProbability.singleToss("H");
            double expectedAnswer = coinProbability.singleToss("T");
            assertEquals(answer, expectedAnswer);
        }

        @DisplayName("Probability of an event not occurring")
        @Test
        public void probabilityOfHeadNotOccurringInSingleToss() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = 1 - coinProbability.singleToss("H");
        }

        @DisplayName("Check Exception for Invalid Toss Face")
        @Test
        public void checkExceptionForSingleToss() {
            assertThrows(IllegalArgumentException.class, () -> {
                        CoinProbability coinProbability = new CoinProbability();
                        coinProbability.singleToss("Z");
                    }
            );
        }
    }

    @Nested
    class doubleCoin{
        @BeforeEach
        public void setUp() {
            coinProbability = new CoinProbability();
        }

        @DisplayName("Probability of Head or Tails on a double coin toss")
        @Test
        public void probabilityOfHeadAndTailInDoubleTossIsEqual() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = coinProbability.doubleToss("H");
            double expectedAnswer = coinProbability.doubleToss("T");
            assertEquals(answer, expectedAnswer);
        }

        @DisplayName("Probability of two events occurring together")
        @Test
        public void probabilityOfHeadAndHead() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = coinProbability.doubleToss("HH");
            double expectedAnswer = 1 / 4;
            assertEquals(answer, expectedAnswer);
        }

        @Test
        public void probabilityOfTailAndTail() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = coinProbability.doubleToss("TT");
            double expectedAnswer = 1 / 4;
            assertEquals(answer, expectedAnswer);
        }

        @DisplayName("Probability of either two events occurring")
        @Test
        public void probabilityOfHeadAndTail() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = coinProbability.doubleToss("HT");
            double expectedAnswer = 2 / 4;
            assertEquals(answer, expectedAnswer);
        }

        @DisplayName("Probability of an event not occurring")
        @Test
        public void probabilityOfHeadNotOccurringInDoubleToss() {
            CoinProbability coinProbability = new CoinProbability();
            double answer = 1 - coinProbability.doubleToss("H");
        }

        @DisplayName("Check Exception for Invalid Toss Output")
        @Test
        public void checkExceptionForDoubleToss() {
            assertThrows(IllegalArgumentException.class, () -> {
                        CoinProbability coinProbability = new CoinProbability();
                        coinProbability.doubleToss("ZT");
                    }
            );
        }
    }

}
