package commands;

import java.util.List;

public class PrependListCommand extends Command{


	@Override
	public void execute(List<String> list, String[] params) {
		prependList(list, params[1]);
		
	}
	
	private void prependList (List<String> list, String param){
		list.add(0, param);
	}
}