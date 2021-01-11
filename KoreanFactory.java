package KoreanOrganizer;
import java.util.Scanner;   

/**
 * this class is to call the month that was requested by the user. 
 * It is made of conditional statements
 * It will return the class with the month if it was found
 */
public class KoreanFactory {
	
	/**
	 * @param month
	 * @return the class that handles that month
	 * if the inputed month is it found, user will be given a chance to make a schedule for it.
	 * if the user chooses to make one, it will go to the class that handles the adding of schedule(NewSchedule)
	 * if the user chooses not to make a schedule, it will return to the main page.
	 * if user enters an invalid choice, the program will exit. 
	 */
	public KoreanMain getSchedule(String month) {
		
		
		if (month.equalsIgnoreCase("january")) {      
			return new monthJanuary();
		}
		else if (month.equalsIgnoreCase("february")) {
			return new monthFebruary();
		}
		else if (month.equalsIgnoreCase("april")) {
			return new monthApril();
		}
		else if (month.equalsIgnoreCase("may")) {
			return new monthMay();
		}
		else if (month.equalsIgnoreCase("june")) {
			return new monthJune();
		}
		else if (month.equalsIgnoreCase("october")) {
			return new monthOctober();
		}
		else if (month.equalsIgnoreCase("november")) {
			return new monthNovember();
		}
		else {
			System.out.println("Schedule not found");
			System.out.println("Would you like to add schedule for that month?");
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("okay");
		
				return new NewSchedule();
			}
			else if(answer.equalsIgnoreCase("no")) {
				System.out.println("Okay.");
				MainMenu.mainPage();
			}
			else {
				System.out.println("Please enter a valid choice.");
				System.exit(0);
			}
		}
		return null;
	}
		
}

