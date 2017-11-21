package commands;

import commands.Command;

import java.util.List;

public class DeleteCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        int index = Integer.parseInt(params[1]);

        if (index < 0 || index > list.size() - 1) {
            throw new IllegalArgumentException(String.format("Error: invalid index %s", index));
        }

        list.remove(index);

        return String.join(" ", list);
    }
}
