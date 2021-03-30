import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CircularShift {
	public List<String> shiftedLines = new ArrayList<String>();		//List with the shifted lines
	
	public void shiftLines(List<String> lines) {		
		for (int i = 0; i < lines.size(); ++i) {		//for each line in the initial input	
			String line = lines.get(i);		//Current line
			List<String> words = new LinkedList<String>(Arrays.asList(line.split(" ")));	//Split the line by spaces
			
			for (int j = 0; j < words.size(); ++j) {		//do circular shift
				shiftedLines.add(line);				
				words.add(words.get(0));		//Append first word to the end of the line
				words.remove(0);				//Remove the first word from the line
				line = String.join(" ", words);	//Save shifted line
			}
		}
	}	
}
