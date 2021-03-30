import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Output {
	public File outputFile = new File("output.txt");		//Creating a special file for output
	
	public void outputToFile(List<String> lines) {			//Printing out all the lines to the file
		try {
			FileWriter writer = new FileWriter(outputFile);
			for (int i = 0; i < lines.size(); ++i) {
				writer.write(lines.get(i) + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputToConsole(List<String> lines) {		//Printing out all the lines to the console
		for (int i = 0; i < lines.size(); ++i) {
			System.out.println(lines.get(i));
		}
	}
	
	
}
