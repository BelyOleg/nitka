import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Bely Oleg on 13.11.2018.
 */
class PressureCalculatorTest {
    @Test
    void W() {
        PressureCalculator calculator = new PressureCalculator();

        assertEquals(calculator.W(0,0), 0);
        assertEquals(calculator.W(1,0), 0.5);
        assertEquals(calculator.W(1,1), 0.5);

        assertEquals(calculator.W(1,2), 0);

        assertEquals(calculator.W(2,0), 0.75);
        assertEquals(calculator.W(2,1), 1.5);
        assertEquals(calculator.W(2,2), 0.75);

        assertEquals(calculator.W(3,0), 0.875);
        assertEquals(calculator.W(3,1), 2.125);
        assertEquals(calculator.W(3,2), 2.125);
        assertEquals(calculator.W(3,3), 0.875);

        assertEquals(calculator.W(322,156), 306.48749781747574);

        calculator.clearCache();
    }
}
