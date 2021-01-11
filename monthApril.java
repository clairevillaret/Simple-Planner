package KoreanOrganizer;

public class monthApril extends KoreanMain {
	public monthApril() {
		month = "April";
		targetLesson = "verbs";
		vocabs = "to eat, to sleep, to drink, to read....";
		numberOfWordsLearned = "12";
		additionalToDo.add("memorize a song");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Basic Korean verbs");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("It's okay not to be okay");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("I can't stop me by TWICE");
	}
	

}
