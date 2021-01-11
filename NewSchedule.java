package KoreanOrganizer;
import java.util.Scanner;

/**
 * this class is called every time user chooses to make a new schedule
 * this is also a subclass of KoreanMain(superclass)
 * that's why the methods here are overridden
 *
 */
public class NewSchedule extends KoreanMain{
	
	@Override
	public void memorize() {
		System.out.println("Enter details for the following: ");
		System.out.println("MEMORIZE: ");
		Scanner scanner = new Scanner(System.in);
		String memo = scanner.nextLine();
		
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		Scanner scanner = new Scanner(System.in);
		String watch = scanner.nextLine();
	}
	@Override
	public void listen() {
		System.out.println("LISTEN: ");
		Scanner scanner = new Scanner(System.in);
		String listen = scanner.nextLine();
		System.out.println("Schedule noted.");
		MainMenu.mainPage();     
	}
	

}
