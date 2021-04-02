package pl.java.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void shouldThrowArithmeticExcpetion() {
        assertThrows(ArithmeticException.class, () -> Operation.divide(5, 0));
    }

    @Test
    void shouldReturnZero() {
        assertEquals(0, Operation.divide(0, 5));
    }
}