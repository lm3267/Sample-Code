import java.util.Observable;
import java.util.Observer;

public class InteractiveKWIC implements Observer{
	UserCommands userCommands = new UserCommands();
	private String command;
	@Override
	public void update(Observable o, Object arg) {	
		command = arg.toString();
		if (command.equals("a")) {
			userCommands.addLine();
		}
		else if (command.equals("d")) {
			userCommands.deleteLine();
		}
		else if (command.equals("p")) {
			userCommands.printLines();
		}
		else if (command.equals("q")) {
			userCommands.quitProgram();
		}		
	}
	
}
