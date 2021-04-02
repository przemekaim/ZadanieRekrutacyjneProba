package pl.java.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @Test
    void shouldReadFile() {
        String value = "subtract 10";
        List<String> strings = Reader.readAllLines("testfile.txt");
        Assertions.assertEquals(value, strings.get(0));

    }

    @Test
    void shouldReturnNull() {
        assertNull(Reader.readAllLines("wrong"));
    }

}