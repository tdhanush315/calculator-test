
package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void additionWorks() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void subtractionWorks() {
        assertEquals(5, calculator.subtract(15, 10));
    }

    @Test
    void multiplicationWorks() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    void divisionWorks() {
        assertEquals(5.0, calculator.divide(20, 4));
    }

    @Test
    void divisionByZeroIsRejected() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
