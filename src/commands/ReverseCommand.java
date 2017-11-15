package commands;

import java.util.Collections;
import java.util.List;

public class ReverseCommand extends Command{
    @Override
    public String execute(List<String> list, String[] params) {
        Collections.reverse(list);

        return String.join(" ", list);
    }
}
