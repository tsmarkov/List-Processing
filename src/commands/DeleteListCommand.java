package commands;

import java.util.List;
public class DeleteListCommand extends Command{

	@Override
	public String execute(List<String> list, String[] params) {
		delete(list, Integer.parseInt(params[1]));

		return String.join(" ", list);
	}

	private void delete(List<String> list, int index) {
		if(index < 0 || index > list.size() - 1)
			throw new IllegalArgumentException(String.format("Error: Invalid index %s", index));

		list.remove(index);
	}
}
