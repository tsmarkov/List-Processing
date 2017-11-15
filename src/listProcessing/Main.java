package listProcessing;

import commands.AppendCommand;
import commands.Command;
import commands.ReverseCommand;

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
                String operationOutput = interpretCommand(commands, theList);
                System.out.println(operationOutput);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static String interpretCommand(String[] input, List<String> theList) {
        Command command = null;
        String output = "";

        switch (input[0].toLowerCase()) {
            case "append":
                command = new AppendCommand();
                output = command.execute(theList, input);
                break;
            case "prepend":
                break;
            case "reverse":
                command = new ReverseCommand();
                output = command.execute(theList, input);
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

        return  output;
    }
}

