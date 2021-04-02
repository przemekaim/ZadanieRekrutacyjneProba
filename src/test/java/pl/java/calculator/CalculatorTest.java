package pl.java.calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldThrowIllegalStateException() {
        Calculator calculator = new Calculator(15.0);
        List<String> stringList = List.of("Didide");
        List<Double> valueList = List.of(5.0);
        //assertThrows(IllegalStateException.class, calculator.calculate(stringList, valueList));
    }
}