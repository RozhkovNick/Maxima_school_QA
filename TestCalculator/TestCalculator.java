
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2,3,5",
                "-4,4,0"})
    void add(double a, double b, double result){
        Assertions.assertEquals(result,calculator.add(a,b));}

    @ParameterizedTest
    @CsvSource({"4,3,1",
            "-4,4,-8"})
    void testSub(double a, double b, double result){
        Assertions.assertEquals(result,calculator.sub(a,b));}

    @ParameterizedTest
    @CsvSource({"4,3,12",
            "-4,4,-16"})
    void testMul(double a, double b, double result){
        Assertions.assertEquals(result,calculator.mul(a,b));}

    @ParameterizedTest
    @CsvSource({"12,3,4",
            "-4,2,-2"})
    void testDiv(double a, double b, double result){
        Assertions.assertEquals(result,calculator.div(a,b));}
    
    @ParameterizedTest(name = "Error: b == 0")
    @CsvSource({"2,0"})
    void testDivExceptions(double a, double b) {
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.div(a, 0);
        });
        Assertions.assertEquals("Error: b == 0", exception.getMessage());}
    
    @ParameterizedTest
    @CsvSource({"2,3,8",
            "4,0,0"})
    void testPow(double a, long b, double result){
        Assertions.assertEquals(result,calculator.pow(a,b));}
}
