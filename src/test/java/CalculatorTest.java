import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(4, calculator.add(2, 2));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    void subtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-5, calculator.subtract(5, 10));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(5, calculator.divide(10, 2));
        assertEquals(-3, calculator.divide(9, -3));
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertThrows(ArithmeticException.class, () -> calculator.divide(0, 0));
    }

    @Test
    void multiply() {
        assertEquals(8, calculator.multiply(4, 2));
        assertEquals(-15, calculator.multiply(5, -3));
        assertEquals(0, calculator.multiply(0, 100));
    }

    @Test
    void solver() {
        assertEquals(5, calculator.solver());
    }
}