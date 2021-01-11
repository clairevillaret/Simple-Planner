package KoreanOrganizer;
import java.util.ArrayList;  

/**
 * this is the main class where other classes are extended from or this is the superclass
 * that is why it is abstract
 *
 */
public abstract class KoreanMain {
	
	String month;
	String targetLesson;
	String vocabs;
	String numberOfWordsLearned;
	ArrayList<String> additionalToDo = new ArrayList<String>();
	
	/**
	 * these methods are implemented by other subclasses so in here it is abstract.
	 */
	public abstract void memorize();
	public abstract void watch();
	public abstract void listen();
	

}
