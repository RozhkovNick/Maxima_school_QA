import org.testng.annotations.Test;

public class TestCalculatorNeg {
    private final Calculator calculator = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivByZero() {
        calculator.div(2, 0);
    }
}
