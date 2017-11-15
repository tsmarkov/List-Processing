package commands;

import java.util.List;

public abstract class Command {
	
	public abstract String execute(List<String> list, String[] params);
}
