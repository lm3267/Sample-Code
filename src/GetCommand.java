import java.util.Observable;
import java.util.Scanner;

public class GetCommand extends Observable{
	public String command;
	
	public void getUserCommand() {
		System.out.println("Type in a command (add, delete, print, quit): ");
		setChanged();
		Scanner sc = new Scanner(System.in);
		command = sc.nextLine();
		Object obj = command;
		notifyObservers(obj);
	}
}
