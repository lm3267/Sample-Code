import java.util.List;

public class MasterControl {

	public static void main(String[] args) {
		Input input = new Input();
		CircularShift shift = new CircularShift();
		Alphabetize alpha = new Alphabetize();
		Output output = new Output();
		
		input.chooseFileOrConsole();		//Ask user for IO type
		if (input.inputType == 1) {
			input.readFromFile();
		}
		else if (input.inputType == 2){
			input.readFromConsole();
		}
		else {
			InteractiveKWIC interctiveKWIC = new InteractiveKWIC();
			GetCommand getCommand = new GetCommand();
			getCommand.addObserver(interctiveKWIC);
			while (true) {
				getCommand.getUserCommand();
			}
		}
		shift.shiftLines(input.lines);
		List<String> alphaLines = alpha.makeAlphabetOrder(shift.shiftedLines);
		
		if (input.inputType == 1) {
			output.outputToFile(alphaLines);
		}
		else if (input.inputType == 2) {
			output.outputToConsole(alphaLines);
		}		
	}
}
