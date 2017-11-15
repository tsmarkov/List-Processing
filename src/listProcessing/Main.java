package listProcessing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public abstract class Main {
	public Main() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> theList = Arrays.asList(reader.readLine().split("\\s+"));
		
		String[] line;
		while ((line = reader.readLine().split("\\s+")) != null && !line[0].equals("end")) {
			
			
		}
	}
}
