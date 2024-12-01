import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(10, calculator.add(8, 2));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(100, 90));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(100, 10));
    }

    @Test
    void times() {
        assertEquals(120, calculator.times(12, 10));
    }

    @Test
    void solver() {
        assertEquals(4, calculator.solver());
    }
}