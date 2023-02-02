import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestCalculator {
    private final Calculator calculator = new Calculator();

    @Test(dataProvider = "testAdd")
    public void testAdd(double result, double expected) {
        Assert.assertEquals(result, expected, "Ошибка при сложении");
    }

    @DataProvider
    public Object[][] testAdd() {
        return new Object[][]{
                {3, calculator.add(1, 2)},
                {1, calculator.add(-1, 2)},
                {2, calculator.add(4, -2)},
                {-12, calculator.add(-10, -2)},
                {10, calculator.add(10, 0)},
                {2, calculator.add(0, 2)},
                {-2, calculator.add(0, -2)},
                {35.9854, calculator.add(12.5498, 23.4356)},
                {-1.889, calculator.add(0.345, -2.234)},
        };
    }

    @Test(dataProvider = "testSub", groups = {"calc"})
    public void testSub(double result, double expected) {
        Assert.assertEquals(result, expected, "Ошибка при вычитании");
    }

    @DataProvider(name = "testSub")
    public Object[][] testSub() {
        return new Object[][]{
                {-1, calculator.sub(1, 2)},
                {-3, calculator.sub(-1, 2)},
                {2, calculator.sub(4, 2)},
                {-2, calculator.sub(0, 2)},
                {-8, calculator.sub(-10, -2)},
                {9.4, calculator.sub(11.56, 2.16)},
                {-10, calculator.sub(-12.350, -2.350)},
                {2, calculator.sub(0, -2)},
                {13.72, calculator.sub(11.56, -2.16)},
        };
    }

    @Test(dataProvider = "testMul")
    public void testMul(double result, double expected) {
        Assert.assertEquals(result, expected, "Ошибка при умножении");
    }

    @DataProvider
    public Object[][] testMul() {
        return new Object[][]{
                {2, calculator.mul(1, 2)},
                {-2, calculator.mul(-1, 2)},
                {-8, calculator.mul(4, -2)},
                {0, calculator.mul(0, 2)},
                {20, calculator.mul(-10, -2)},
                {24.969600000000003, calculator.mul(11.56, 2.16)},
                {29.0225, calculator.mul(-12.350, -2.350)},
                {-24.969600000000003, calculator.mul(11.56, -2.16)},
                {-24.969600000000003, calculator.mul(-11.56, 2.16)},
        };
    }

    @Test(dataProvider = "testPow")
    public void testPow(double result, double expected) {
        Assert.assertEquals(result, expected, "Ошибка при возведении в степень");
    }

    @DataProvider
    public Object[][] testPow() {
        return new Object[][]{
                {4096.0, calculator.pow(2, 12)},
                {4, calculator.pow(-2, 2)},
                {0.25, calculator.pow(2, -2)},
                {0, calculator.pow(0, 2)},
                {0.01, calculator.pow(-10, -2)},
                {133.6336, calculator.pow(11.56, 2)},
                {1, calculator.pow(12, 0)},
                {0.002741134146451878, calculator.pow(13, -2.3)},
                {364.8124997072468, calculator.pow(13, 2.3)},
                {0.00505837565201841, calculator.pow(11.56, -2.16)},
        };
    }

    @Test(dataProvider = "testDiv")
    public void testDiv(double result, double expected) {
        Assert.assertEquals(result, expected, "Ошибка при делении");
    }

    @DataProvider
    public Object[][] testDiv() {
        return new Object[][]{
                {0.5, calculator.div(1, 2)},
                {-0.5, calculator.div(-1, 2)},
                {2, calculator.div(4, 2)},
                {0, calculator.div(0, 2)},
                {5, calculator.div(-10, -2)},
                {5.351851851851852, calculator.div(11.56, 2.16)},
                {5.25531914893617, calculator.div(-12.350, -2.350)},
                {-0.0, calculator.div(0, -2)},
                {-5.351851851851852, calculator.div(11.56, -2.16)},
                {5.78, calculator.div(11.56, 2)},
                {5.092592592592593, calculator.div(11, 2.16)},
        };
    }
}

