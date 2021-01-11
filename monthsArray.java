package KoreanOrganizer;
import java.util.Arrays;
import java.util.Scanner;

/**
 * this class is to check whether which months contain a schedule
 */
public class monthsArray {
	
	/**
	 * In here, we have an array that contains the months with schedule
	 * lambda expression to check if the month that was passed in this method matches any in the array
	 * since it is boolean, if it's true(if found), if it will proceed to the conditional statements
	 * if the month was not found then that means there is no existing schedule and will called the NewSchedule class
	 * @param inputMonth
	 */
	public void checkMonth(String inputMonth) {
		
		String months[] = {"january","february","april","may","june","november","october"};
		
		boolean found = Arrays.stream(months).anyMatch(t -> t.equalsIgnoreCase(inputMonth));
		
			if (found) {
				System.out.println("You already have a schedule for that month.");
				System.out.println("Continue [press 1]");
				System.out.println("Go Back [press 0]");
				Scanner scan = new Scanner(System.in);
				String userinput = scan.nextLine();
				
				if (userinput.equals("1")) {
					NewSchedule ns = new NewSchedule();
					ns.memorize();
					ns.watch();
					ns.listen();
				}
				else if (userinput.equals("0")) {
					MainMenu.mainPage();
				}
				else {
					System.out.println("Enter a valid choice.");
					MainMenu.mainPage();
				}
			}
			
			else {
				System.out.println("Schedule for the month of "+inputMonth);
				NewSchedule ns = new NewSchedule();
				ns.memorize();
				ns.watch();
				ns.listen();
			}
		}
}


