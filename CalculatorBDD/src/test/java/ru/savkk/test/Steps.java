package ru.savkk.test;

import Calculator.Calculator;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class Steps {
    public Calculator calculator;
    public Double result;

    @Когда("^взяли калькулятор$")
    public void takeCalculator() {
        calculator = new Calculator();
    }

    @И("сложили число (\\d+) и число (\\d+)")
    public void add(Double x, Double y) {
        result = calculator.add(x, y);
    }

    @И("^вычли число (\\d+) и число (\\d+)$")
    public void sub(Double x, Double y) {
        result = calculator.sub(x, y);
    }

    @И("^умножили число (\\d+) и число (\\d+)$")
    public void mul(Double x, Double y) {
        result = calculator.mul(x, y);
    }

    @И("^разделили число (\\d+) и число (\\d+)$")
    public void div(Double x, Double y) {
        result = calculator.div(x, y);
    }

    @Тогда("^должны получить ответ (\\d+)$")
    public void checkResult(Double z) {
        Assert.assertEquals(result, z);
    }
}
