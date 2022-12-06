import java.security.InvalidParameterException;

public class Calculator {
    private double result; // TODO: Impl me!

    public double getResult() {
        return result;
    }

    public double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;
        return result;
    }

    public double div(double a, double b) {
        if (b == 0) {
            throw new InvalidParameterException("Error: b == 0");
        }
        double result = a / b;
        return result;
    }

    public double pow(double a, long pow) {
        double result = Math.pow(a, pow);
        return result;
    }

}
