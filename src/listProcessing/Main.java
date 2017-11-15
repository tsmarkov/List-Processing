package listProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> theList = Arrays.asList(reader.readLine().split("\\s+"));


        while (true) {
            String[] commands = reader.readLine().split("\\s+");

            if (commands[0].equalsIgnoreCase("end")) {
                break;
            }

            try {
                interpretCommand(commands, theList);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static void interpretCommand(String[] input, List<String> theList) {
        switch (input[0].toLowerCase()) {
            case "append":
                break;
            case "prepend":
                break;
            case "reverse":
                break;
            case "insert":
                break;
            case "delete":
                break;
            case "roll":
                break;
            case "sort":
                break;
            case "count":
                break;
            case "end":
                break;
        }
    }
}
