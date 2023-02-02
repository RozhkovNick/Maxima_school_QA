package Test;

import Main.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalculatorNeg {

    private final Calculator calculator = new Calculator();

    @Test
    void testDivByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(1, 0);
        });
    }
}