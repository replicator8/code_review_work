import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(20, calculator.add(18, 2));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(10, 9));
    }

    @Test
    void div() {
        assertEquals(10, calculator.div(1000, 100));
    }

    @Test
    void times() {
        assertEquals(1200, calculator.times(120, 10));
    }

    @Test
    void solver() {
        assertEquals(84, calculator.solver());
    }
}