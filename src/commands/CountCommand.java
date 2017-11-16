package commands;

import java.util.List;

public class CountCommand extends Command{
    @Override
    public String execute(List<String> list, String[] params) {
        String searched = params[1];

        int counter = 0;
        for (String element : list) {
            if (element.equals(searched)){
                counter++;
            }
        }

        return Integer.toString(counter);
    }
}
