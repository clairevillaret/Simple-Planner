package KoreanOrganizer;

public class monthMay extends KoreanMain {
	public monthMay() {
		month = "May";
		targetLesson = "Negative Expressions";
		vocabs = "to not be, can not, not...";
		numberOfWordsLearned = "10";
		additionalToDo.add("practice writing korean");
		additionalToDo.add("read book");
	}
	@Override
	public void memorize() {
		System.out.println("MEMORIZE: ");
		System.out.println("Korean Negative Expressions");
	}
	@Override
	public void watch() {
		System.out.println("WATCH: ");
		System.out.println("Train to Busan (MOVIE)");
	}
	@Override
	public void listen() {
		System.out.println("LISTEN TO: ");
		System.out.println("How You Like That by BlackPink");
	}
	

}
