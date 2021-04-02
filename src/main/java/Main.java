import java.util.List;

public class Main {
    public static void main(String[] args) {

//        if (args.length < 1) {
//            System.err.println("Wrong usage.");
//            System.exit(1);
//        }

        List<String> fileContent = Reader.readAllLines();
        if (fileContent != null) {
            var calculator = InputParser.readLastLine(fileContent);
            List<String> commands = InputParser.parseCommands(fileContent);
            List<Double> values = InputParser.parseValues(fileContent);
            calculator.calculate(commands, values);
        }
    }
}
