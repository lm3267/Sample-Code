import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserCommands {
	public List<String> lines = new ArrayList<String>();
	CircularShift shift = new CircularShift();
	Alphabetize alpha = new Alphabetize();
	Output output = new Output();
	public List<String> alphaLines = new ArrayList<String>();
	
	
	public void addLine() {
		System.out.println("Type a line to add: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		lines.add(s);
		System.out.println("Line added.");
	}
	
	public void deleteLine() {
		System.out.println("Type a line to delete: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		lines.remove(s);
		System.out.println("Line deleted.");
	}
	
	public void printLines() {
		alphaLines.clear();
		System.out.println("-----------------------");
		shift.shiftLines(lines);
		alphaLines = alpha.makeAlphabetOrder(shift.shiftedLines);
		output.outputToConsole(alphaLines);	
		System.out.println("-----------------------");
	}
	
	public void quitProgram() {
		System.out.println("Exiting program.");
		System.exit(1);
	}
}
