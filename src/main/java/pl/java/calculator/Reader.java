package pl.java.calculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {

    public static List<String> readAllLines(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
