package commands;

import java.util.List;

public class PrependCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        list.add(0, params[1]);

        return String.join(" ", list);
    }
}
