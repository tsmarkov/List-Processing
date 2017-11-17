package commands;

import java.util.List;

public class RollCommand extends Command {
    @Override
    public String execute(List<String> list, String[] params) {
        switch (params[1]) {
            case "left":
                rollLeft(list);
                break;
            case "right":
                rollRight(list);
                break;
            default:
                throw new IllegalArgumentException("Error: invalid command");
        }

        return String.join(" ", list);
    }

    private void rollLeft(List<String> list) {
        if (list.size() > 0) {
            String firstElement = list.remove(0);
            list.add(firstElement);
        } else {
            throw new IllegalArgumentException("List is empty, can not roll left.");
        }
    }

    private void rollRight(List<String> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot roll right.");
        }

        String lastElement = list.remove(list.size() - 1);
        list.add(0, lastElement);
    }
}
