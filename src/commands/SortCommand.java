package commands;

import java.util.Collections;
import java.util.List;

public class SortCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        Collections.sort(list);

        return String.join(" ", list);
    }
}
