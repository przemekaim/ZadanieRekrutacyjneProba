package pl.java.calculator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {
    @Test
    void shouldThrowIllegalArgumentException() {
        List<String> strings = Reader.readAllLines("testfile.txt");
        assertThrows(IllegalArgumentException.class,
                () -> InputParser.readLastLine(strings));
    }

    @Test
    void shouldThrowNumberFormatException() {
        List<String> strings = Reader.readAllLines("testfile.txt");
        assertThrows(NumberFormatException.class,
                () -> InputParser.parseValues(strings));
    }
}