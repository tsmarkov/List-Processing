package commands;

import commands.Command;

import java.util.List;

public class DeleteCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        //TODO: Validation of index

        delete(list, Integer.parseInt(params[1]));

        return String.join(" ", list);
    }

    private void delete(List<String> list, int index) {
        if(index < 0 || index > list.size() - 1)
            throw new IllegalArgumentException(String.format("Error: invalid index %s", index));

        list.remove(index);
    }
}
