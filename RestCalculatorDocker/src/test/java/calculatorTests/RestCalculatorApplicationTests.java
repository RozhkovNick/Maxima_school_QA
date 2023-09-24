package calculatorTests;

import calculator.service.RestCalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class RestCalculatorApplicationTests {

    @Autowired
    RestCalculatorService calculatorService;

    @Test
    void testAdd() {
        BigDecimal actualResult = calculatorService.add(BigDecimal.TEN, BigDecimal.TEN);
        BigDecimal expectedResult = BigDecimal.valueOf(20);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testSubtract() {
        BigDecimal actualResult = calculatorService.subtract(BigDecimal.valueOf(10), BigDecimal.valueOf(18));
        BigDecimal expectedResult = BigDecimal.valueOf(-8);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testMultiply() {
        BigDecimal actualResult = calculatorService.multiply(BigDecimal.valueOf(5), BigDecimal.TEN);
        BigDecimal expectedResult = BigDecimal.valueOf(50);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testDivision() {
        BigDecimal actualResult = calculatorService.division(BigDecimal.valueOf(1), BigDecimal.valueOf(3));
        BigDecimal expectedResult = BigDecimal.valueOf(0.33333);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testPow(){
		BigDecimal actualResult = calculatorService.pow(BigDecimal.valueOf(2), Integer.valueOf(2));
		BigDecimal expectedResult = BigDecimal.valueOf(4);
		Assertions.assertEquals(expectedResult,actualResult);
	}
}

