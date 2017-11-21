package listProcessing;

import commands.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean[] isfinished = new boolean[]{false};
		List<String> theList = new ArrayList<>();
		Collections.addAll(theList, reader.readLine().split("\\s+"));

		System.out.println(String.join(" ", theList));

		while (!isfinished[0]) {
			String[] commands = reader.readLine().split("\\s+");
			try {
				String operationOutput = interpretCommand(commands, theList, isfinished);
				System.out.println(operationOutput);
			} catch (IllegalArgumentException exception) {
				System.out.println(exception.getMessage());
			}
		}
	}

	private static String interpretCommand(String[] input, List<String> theList, boolean[] isfinished) {
		Command command = null;
		String output = "";

		switch (input[0]) {
		case "append":
			checkNumberOfParams(2, input);
			command = new AppendCommand();
			output = command.execute(theList, input);
			break;
		case "prepend":
			checkNumberOfParams(2, input);
			command = new PrependCommand();
			output = command.execute(theList, input);
			break;
		case "reverse":
			command = new ReverseCommand();
			output = command.execute(theList, input);
			break;
		case "insert":
			checkNumberOfParams(3, input);
			checkParamsValidation(input[1]);
			command = new InsertCommand();
			output = command.execute(theList, input);
			break;
		case "delete":
			checkNumberOfParams(2, input);
			checkParamsValidation(input[1]);
			command = new DeleteCommand();
			output = command.execute(theList, input);
			break;
		case "roll":
			checkNumberOfParams(2, input);
			command = new RollCommand();
			output = command.execute(theList, input);
			break;
		case "sort":
			checkNumberOfParams(1, input);
			command = new SortCommand();
			output = command.execute(theList, input);
			break;
		case "count":
			checkNumberOfParams(2, input);
			command = new CountCommand();
			output = command.execute(theList, input);
			break;
		case "end":
			checkNumberOfParams(1, input);
			isfinished[0] = true;
			output = "Finished";
			break;
		default:
			throw new IllegalArgumentException("Error: invalid command");
		}

		return output;
	}

	private static void checkNumberOfParams(int expectedNumberOfParams, String[] input) {
		if (input.length != expectedNumberOfParams) {
			throw new IllegalArgumentException("Error: invalid command parameters");
		}
	}

	private static void checkParamsValidation(String... input) {
		try {
			for (String string : input) {
				Integer.parseInt(string);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Error: invalid command parameters");
		}
	}
}
