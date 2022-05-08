import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class MaxMinArrTest {
    MaxMinArr maxMinArr = new MaxMinArr();

    @DisplayName("Check for positive array values")
    @Nested
    public class PositiveValuesTest {
        @BeforeEach
        public void init() {
            maxMinArr = new MaxMinArr();
        }

        @Test
        public void CheckPositive() {
            maxMinArr.insertArr(new int[]{0,10,20,30,40,50,60,70,80,90,100},11);
            assertArrayEquals(new int[]{100,0},maxMinArr.findMaxAndMin(maxMinArr.getArr()));
        }

        @AfterEach
        public void clear() {
             maxMinArr.setArr(null);
        }

    }
    @DisplayName("Check for negative array values")
    @Nested
    public class NegativeValuesTest {
        @BeforeEach
        public void init() {
            maxMinArr = new MaxMinArr();
        }

        @Test
        public void CheckNegative() {
            maxMinArr.insertArr(new int[]{0,-10,-20,-30,-40,-50,-60,-70,-80,-90,-100},11);
            assertArrayEquals(new int[]{0,-100},maxMinArr.findMaxAndMin(maxMinArr.getArr()));
        }


        @AfterEach
        public void clear() {
            maxMinArr.setArr(null);
        }
    }

    @DisplayName("Check for both positive and negative array values")
    @Nested
    public class PositiveAndNegativeValuesTest {
        @BeforeEach
        public void init() {
            maxMinArr = new MaxMinArr();
        }

        @Test
        public void CheckPositiveAndNegative() {
            maxMinArr.insertArr(new int[]{0,-10,20,-30,40,-50,60,-70,80,-90,100},11);
            assertArrayEquals(new int[]{100,-90},maxMinArr.findMaxAndMin(maxMinArr.getArr()));
        }


        @AfterEach
        public void clear() {
            maxMinArr.setArr(null);
        }
    }
}