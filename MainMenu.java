package KoreanOrganizer;
import java.util.Scanner;

/**
 * @author Claire Iris B. Villaret
 * This is the main method of this program
 * this is the class that displays the main page
 *
 */
public class MainMenu {
	public static void main(String[] args) {
		System.out.println("Welcome to your Monthly Planner!");
		mainPage();
		
	}

	/**
	 * this is the method that displays the main page
	 * it is composed of conditional statements
	 * depending on the user's input, it will call the corresponding methods below
	 */
	static void mainPage() {
		
		System.out.println("\nFind schedule [press 1]");
		System.out.println("Add new schedule [press 0]");
		System.out.println("Exit [press x]");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		
		if (answer.equals("1")) {
			findSchedule();       
		}
		else if(answer.equals("0")) {
			addSchedule();
		}
		else if(answer.equalsIgnoreCase("x")) {
			System.exit(0);
		}
		else {
			System.out.println("Enter a valid choice.");
			mainPage();
		}
	}
	
	/**
	 * this method is to find the schedule (option 1)
	 * We created an object for "KoreanPlanner" so that i can access the method inside that class
	 */
	private static void findSchedule() {
		KoreanPlanner kp = new KoreanPlanner();
		kp.findSchedule();
	}
	
	/**
	 * this method is to add a new schedule (option 2)
	 * It goes inside the monthsArray class after the inputed month was passed;
	 * And then that class will handle the rest
	 */
	private static void addSchedule() {
		System.out.println("Enter month: ");
		Scanner scanner1 = new Scanner(System.in);
		String inputmonth = scanner1.nextLine();
		
		monthsArray page = new monthsArray();
		page.checkMonth(inputmonth);
		}
		
	}



