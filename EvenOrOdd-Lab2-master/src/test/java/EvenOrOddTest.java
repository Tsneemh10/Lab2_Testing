import org.junit.jupiter.api.*;
import static org.junit.Assert.*;

public class EvenOrOddTest {
    EvenOrOdd evenOrOdd;

    @DisplayName("Check for even numbers")
    @Nested
    public class EvenTest {
        @BeforeEach
        public void init() {
            evenOrOdd = new EvenOrOdd();
        }

        @Test
        public void CheckEven() {
            for (int i = 0; i <= 50; i += 2)
                assertEquals("Even", evenOrOdd.EO(i));
        }

        @AfterEach
        public void clear() {
            evenOrOdd = null;
        }

    }
        @DisplayName("Check for odd numbers")
        @Nested
        public class OddTest {
            @BeforeEach
            public void init() {
                evenOrOdd = new EvenOrOdd();
            }

            @Test
            public void CheckOdd() {
                for (int i = 1; i < 50; i += 2)
                    assertEquals("Odd", evenOrOdd.EO(i));
            }

            @AfterEach
            public void clear() {
                evenOrOdd = null;
            }
        }
}