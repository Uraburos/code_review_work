import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void dif() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.dif(3, 2));
    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.div(6, 3));
    }

    @Test
    void times() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.times(4, 2));
    }

    @Test
    void solver() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.solver());
    }
}