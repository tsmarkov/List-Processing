package listProcessing;

import commands.AppendCommand;
import commands.Command;
import commands.PrependListCommand;

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
            if (commands[0].equalsIgnoreCase("end"))
                break;
            try { 
                Command command = interpretCommand(commands);
                command.execute(theList, commands);
                System.out.println(theList.toString().replaceAll("[\\[\\]\\,]", " "));
                
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static Command interpretCommand(String[] input) {
        
		switch (input[0]) {
		case "append":
			return new AppendCommand();
		case "prepend":
			return new PrependListCommand();
		case "reverse":
			return new PrependListCommand();
		case "insert":
			return new PrependListCommand();
		case "delete":
			return new PrependListCommand();
		case "roll":
			return new PrependListCommand();
		case "sort":
			return new PrependListCommand();
		case "count":
			return new PrependListCommand();
		case "end":
			return new PrependListCommand();

		default:
			throw new IllegalArgumentException("Error: invalid command");
		}
	}
}
