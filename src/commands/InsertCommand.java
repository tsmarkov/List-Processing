package commands;

import java.util.List;

public class InsertCommand extends Command {
	@Override
	public String execute(List<String> list, String[] params) {
		int index = Integer.parseInt(params[1]);
		if (index < 0 || index > list.size() - 1) {
			throw new IllegalArgumentException(String.format("Error: invalid index %s", params[1]));
		}

		list.add(index, params[2]);

		return String.join(" ", list);
	}
}
