package listProcessing;

import commands.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> theList = new ArrayList<>();
        Collections.addAll(theList, reader.readLine().split("\\s+"));


        while (true) {
            String[] commands = reader.readLine().split("\\s+");

            if (commands[0].equalsIgnoreCase("end")) {
                System.out.println("Finished");
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

        switch (input[0]) {
            case "append":
                checkNumberOfParams(2,input);
                command = new AppendCommand();
                output = command.execute(theList, input);
                break;
            case "prepend":
                checkNumberOfParams(2,input);
                break;
            case "reverse":
                command = new ReverseCommand();
                output = command.execute(theList, input);
                break;
            case "insert":
                checkNumberOfParams(3,input);
                command = new InsertCommand();
                output = command.execute(theList,input);
                break;
            case "delete":
                checkNumberOfParams(2,input);
                break;
            case "roll":
                checkNumberOfParams(2,input);
                command = new RollCommand();
                output = command.execute(theList,input);
                break;
            case "sort":
                break;
            case "count":
                checkNumberOfParams(2,input);
                command = new CountCommand();
                output = command.execute(theList, input);
                break;
            default:
                throw new IllegalArgumentException("Error: invalid command");
        }

        return  output;
    }

    private static void checkNumberOfParams(int expectedNumberOfParams, String[] input){
       if(input.length != expectedNumberOfParams){
           throw new IllegalArgumentException("Error: invalid command parameters");
       }
    }
}

