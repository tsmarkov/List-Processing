package commands;

import java.util.List;

public abstract class Command {
	
	abstract String execute(List<String> list, String[] params);
}
