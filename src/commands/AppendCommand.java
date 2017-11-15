package commands;

import java.util.List;

public class AppendCommand extends Command {

    @Override
    public String execute(List<String> list, String[] params) {
        list.add(params[1]);

        return String.join(" ", list);
    }
}
