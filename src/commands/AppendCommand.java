package commands;

import java.util.List;

public class AppendCommand extends Command {

    @Override
    public void execute(List<String> list, String[] params) {
        list.add(params[1]);
    }
}
