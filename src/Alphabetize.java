import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Alphabetize {
	public List<String> alphaLines = new ArrayList<String>();		//List with the alphabetized lines
	
	public List<String> makeAlphabetOrder(List<String> lines) {
		lines.sort(Comparator.comparing( String::toString ));		//Alphabet Sort
		return lines;
	}
}
