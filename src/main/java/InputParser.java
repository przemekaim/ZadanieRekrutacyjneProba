import java.util.List;
import java.util.stream.Collectors;

public class InputParser {

    public static List<String> parseCommands(List<String> contentFile) {
        return contentFile.subList(0, contentFile.size() - 1)
                .stream()
                .map(x -> x.split(" "))
                .peek(InputParser::checkFileFormat)
                .map(e -> e[0])
                .collect(Collectors.toList());
    }


    public static List<Double> parseValues(List<String> contentFile) {
        return contentFile.subList(0, contentFile.size() - 1)
                .stream()
                .map(e -> e.split(" "))
                .map(InputParser::parseDouble)
                .collect(Collectors.toList());
    }


    private static void checkFileFormat(String[] tokens) {
        if (tokens.length != 2)
            throw new IllegalArgumentException("Wrong file format!");
    }


    private static double parseDouble(String[] tokens) {
        try {
            return Double.parseDouble(tokens[1]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("This is not a number.");
        }
    }


    public static Calculator readLastLine(List<String> contentFile) {
        String lastLine = contentFile.get(contentFile.size() - 1);
        String[] tokens = lastLine.split(" ");
        if (tokens.length != 2)
            throw new IllegalArgumentException("Wrong file format!");
        if (!tokens[0].equalsIgnoreCase("apply"))
            throw new IllegalArgumentException("Last line should conain APPLY command!");

        return new Calculator(Double.parseDouble(tokens[1]));
    }
}

