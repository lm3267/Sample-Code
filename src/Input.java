import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
	public int inputType;		//1 - input from file; 2 - input from console; 3 - implicit invocation
	public List<String> lines = new ArrayList<String>();	//List with the lines
	public File inputFile = new File("input.txt");			//Input file
	
	public void chooseFileOrConsole() {		//Ask user for IO preference (file or console) 
		System.out.println("Type '1' for file IO, '2' for console IO, '3' for manual command input.");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if (s == 1) {
			inputType = 1;
		}
		else if (s == 2) {
			inputType = 2;
		}
		else if (s == 3) {
			inputType = 3;
		}
	}
	
	public void readFromFile() {		//Read input from File
		try {
			Scanner sc = new Scanner(inputFile);
			while (sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}
			sc.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readFromConsole() {		//Read input from Console
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		while (s.length() != 0) {
			lines.add(s);
			s = sc.nextLine();
		}
		sc.close();
	}
}
