package commands;

import java.util.List;

public class RollCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        switch (params[1]) {
            case "left":
                break;
            case "right":
                String lastElement = list.remove(list.size() - 1);
                list.add(0, lastElement);
                break;
            default:
                throw new IllegalArgumentException("Error: invalid command");
        }

        return String.join(" ", list);
    }
}
