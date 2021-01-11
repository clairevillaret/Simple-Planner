package KoreanOrganizer;

/**
 * this is one of the subclass for KoreanMain(superclass)
 * All of the classes for each month are subclasses of KoreanMain class
 * the methods are overridden since in the superclass they were abstract methods and;
 * these methods will be implemented by this class
 *
 */
public class monthJanuary extends KoreanMain {
	
	public monthJanuary() {
		month = "January";
		targetLesson = "Intro to Korean";
		vocabs = "subject/topic marker, this,that";
		numberOfWordsLearned = "5";
		additionalToDo.add("watch Your Name japanese movie");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Sino-korean and native numbers");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("Chicago Tyepwriter");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("Happy Ending by Seventeen");
	}
	

}
