package pl.java.calculator;

import java.util.List;

public class Calculator {
    private final double initValue;
    private double result;

    public Calculator(double initValue) {
        this.initValue = initValue;
        result = 0;
    }

    public void calculate(List<String> commands, List<Double> values) {
        double tempValue;
        result = initValue;
        String command;
        for (int i = 0; i < commands.size(); i++) {
            command = commands.get(i).toLowerCase();
            tempValue = switch (command) {
                case "add" -> Operation.add(result, values.get(i));
                case "subtract" -> Operation.subtract(result, values.get(i));
                case "divide" -> Operation.divide(result, values.get(i));
                case "multiply" -> Operation.multiply(result, values.get(i));
                default -> throw new IllegalStateException("Unexpected value: " + commands.get(i));
            };
            result = tempValue;
        }
        System.out.println(result);
    }
}
