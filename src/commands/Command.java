package commands;

import java.util.List;

public abstract class Command {
	
	public abstract void execute(List<String> list, String[] params);
}
