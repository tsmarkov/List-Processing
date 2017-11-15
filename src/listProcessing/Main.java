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

            if (commands[0].equalsIgnoreCase("end")){
                break;
            }

            //interpretCommand(commands, theList);
        }
    }
}
