package KoreanOrganizer;
import java.util.Scanner;

/**
 * this class is called every time you chooses to find a schedule
 */
public class KoreanPlanner {
	
	/**
	 *  in here, planner object was created so that we can access the KoreanFactory class
	 *  user's input month will be passed on to the KoreanMain class to check if there is an existing schedule or not
	 *  And then, the methods in the KoreanClass will be displayed to be answered by the user
	 *  And then it always go back to the main page
	 */
	public void findSchedule() {
		System.out.println("Find out your schedule for each month");
		System.out.println("Enter month: ");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.nextLine();
		
		KoreanFactory planner = new KoreanFactory();
		
		KoreanOrganizer.KoreanMain sched = planner.getSchedule(month); 
		System.out.println("Schedule for the month of "+ month +"\n");
		
		sched.memorize();  
		sched.watch();       
		sched.listen();      
		MainMenu.mainPage();
				
	}
			
}

